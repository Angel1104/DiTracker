package com.dh.ditracker.service;

import com.dh.ditracker.api.response.user.UserResponse;
import com.dh.ditracker.model.mapper.UserMapper;
import com.dh.ditracker.util.function.Utils;
import org.springframework.stereotype.Service;

import com.dh.ditracker.model.domain.UserEntity;
import com.dh.ditracker.model.repository.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponse saveUser(UserResponse userResponse) {
        Optional<UserEntity> userEntity = userRepository.findById(userResponse.getUserId());
        if (userEntity.isEmpty()) {
            UserEntity preEntity = userMapper.mapperToUserEntityFrom(userResponse);
            if (Utils.isNull(preEntity.getId())) {
                Optional<UserEntity> lastEntity = userRepository.findFirstByOrderByIdDesc();
                int lastRegistrationId = lastEntity.isPresent() ? lastEntity.get().getId() : 0;
                preEntity.setId(lastRegistrationId + 1);
            }
            UserEntity postEntity = userRepository.save(preEntity);
            return userMapper.mapperToUserResponseFrom(postEntity);
        }
        return new UserResponse();
    }
}
