package com.dh.ditracker.api.request.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {
    private String userName;
    private String password;
}
