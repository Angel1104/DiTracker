package com.dh.ditracker.service;

import com.dh.ditracker.api.response.user.UserResponse;

public interface UserService {
    UserResponse saveUser(UserResponse userResponse);
}
