package com.dh.ditracker.service;

import org.springframework.stereotype.Service;

import com.dh.ditracker.model.domain.UserEntity;
import com.dh.ditracker.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteUser(Integer userId) {
        UserEntity entity = userRepository.findById(userId).orElse(new UserEntity());
        userRepository.delete(entity);
    }
}
