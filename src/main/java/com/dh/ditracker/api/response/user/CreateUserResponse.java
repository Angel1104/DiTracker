package com.dh.ditracker.api.response.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponse {
    private Integer userId;
    private String userName;
    private String password;
}
