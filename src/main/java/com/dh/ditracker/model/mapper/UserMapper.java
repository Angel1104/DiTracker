package com.dh.ditracker.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.dh.ditracker.api.response.user.CreateUserResponse;
import com.dh.ditracker.api.request.user.CreateUserRequest;
import com.dh.ditracker.api.response.user.UserResponse;
//import com.dh.ditracker.gateway.dto.UserApiResponse;
import com.dh.ditracker.model.domain.UserEntity;
import com.dh.ditracker.util.constant.ResponseConstant.SuccessResponse;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, imports = { SuccessResponse.class })
public interface UserMapper {

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
//    UserResponse mapperToUserResponseFrom(UserApiResponse source);
    UserResponse mapperToUserResponseFrom(UserEntity source);

    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    UserEntity mapperToUserEntityFrom(UserResponse source);

    default UserResponse mapperToUserResponseFrom(CreateUserRequest source) {
        UserResponse target = new UserResponse();
        target.setUserId(source.getUserId());
        target.setUserName(source.getUserName());
        target.setPassword(source.getPassword());
        target.setName(source.getName());
        target.setLastName(source.getLastName());
        target.setEmail(source.getEmail());
        return target;
    }

    default CreateUserResponse mapperToCreateUserResponseFrom(UserResponse source) {
        return toCreateUserResponse(SuccessResponse.CODE, SuccessResponse.MESSAGE, source);
    }

    CreateUserResponse toCreateUserResponse(String code, String message, UserResponse userResponse);

}
