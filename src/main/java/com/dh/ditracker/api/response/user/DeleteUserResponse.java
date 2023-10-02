package com.dh.ditracker.api.response.user;

import com.dh.ditracker.api.response.CommonResponse;
import com.dh.ditracker.util.constant.ResponseConstant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteUserResponse extends CommonResponse {
    public DeleteUserResponse() {
        super(ResponseConstant.SuccessResponse.CODE, ResponseConstant.SuccessResponse.MESSAGE);
    }
}
