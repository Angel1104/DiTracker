package com.dh.ditracker.api.response.user;

import lombok.Getter;
import lombok.Setter;

public class UserResponse {

    @Getter
    @Setter
    private Integer characterId;
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private String email;
}
