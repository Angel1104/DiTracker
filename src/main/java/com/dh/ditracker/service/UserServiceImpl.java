package com.dh.ditracker.service;

import com.dh.ditracker.api.response.user.UserResponse;
import com.dh.ditracker.model.domain.UserEntity;
import com.dh.ditracker.model.mapper.UserMapper;
import com.dh.ditracker.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired UserServiceImpl(UserMapper userMapper, UserRepository userRepository){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponse updateUser(UserResponse userResponse){
        Optional<UserEntity> userEntity = userRepository.findByRegistrarionId(userResponse.getUserId());
        if(userEntity.isPresent()){
            UserEntity preEntity = userEntity.get();
            this.userMapper.
                    updateUserResponseFrom(userResponse, preEntity);
            UserEntity postEntity = userRepository.save(preEntity);
            return userMapper.mapperToUserResponseFrom(postEntity);
        }
        return new UserResponse();
    }
}
