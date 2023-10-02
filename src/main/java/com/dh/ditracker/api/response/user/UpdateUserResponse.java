package com.dh.ditracker.api.response.user;

import com.dh.ditracker.api.response.CommonResponse;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateUserResponse extends CommonResponse {
    private UserResponse userResponse;
}
