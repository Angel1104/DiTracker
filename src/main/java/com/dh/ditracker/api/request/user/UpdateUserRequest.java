package com.dh.ditracker.api.request.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserRequest {
    private Integer userId;
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private String email;
}
