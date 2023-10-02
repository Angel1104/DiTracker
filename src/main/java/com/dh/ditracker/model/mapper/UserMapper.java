package com.dh.ditracker.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, imports = {SuccessResponse.class})
public interface UserMapper {
    @Mapping(source = "id", target = "userId")
    @Mapping(source = "name", target = "name")
    @Mapping(expression = "java(source.getStatus().toUpperCase())", target = "status")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "type", target = "type")
    @Mapping(expression = "java(source.getGender().toUpperCase())")
    UserResponse mapperToUserResponseFrom(UserApiResponse source);

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "password", target = "password")
    UserResponse mapperToUserResponseFrom(UserEntity source);

    default GetUserListResponse mapperToGetUserListResponseFrom(List<UserResponse> sourceList) {
        return toGetUserListResponse(SuccessResponse.CODE, SuccessResponse.MESSAGE, sourceList);
    }


}
