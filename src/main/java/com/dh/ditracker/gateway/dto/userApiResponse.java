package com.dh.ditracker.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserApiResponse extends ApiResponse{
    private Integer userId;
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private String email;
}
