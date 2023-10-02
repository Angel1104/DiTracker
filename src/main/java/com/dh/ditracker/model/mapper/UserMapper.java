//package com.dh.ditracker.model.mapper;
//
//import com.dh.ditracker.api.request.user.UpdateUserRequest;
//import com.dh.ditracker.api.response.user.UpdateUserResponse;
//import com.dh.ditracker.api.response.user.UserResponse;
//import com.dh.ditracker.model.domain.UserEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.MappingConstants;
//import org.mapstruct.MappingTarget;
//
//import com.dh.ditracker.util.constant.ResponseConstant.SuccessResponse;
//
//@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, imports = {SuccessResponse.class})
//public interface UserMapper {
//    @Mapping(source = "id", target = "userId")
//    @Mapping(source = "userName", target = "userName")
//    @Mapping(source = "password", target = "password")
//    @Mapping(source = "name", target = "name")
//    @Mapping(source = "lastName", target = "lastName")
//    @Mapping(source = "email", target = "email")
//    UserResponse mapperToUserResponseFrom(UserEntity source);
//
//    @Mapping(source = "userName", target = "userName")
//    @Mapping(source = "password", target = "password")
//    @Mapping(source = "name", target = "name")
//    @Mapping(source = "lastName", target = "lastName")
//    @Mapping(source = "email", target = "email")
//    void updateUserResponseFrom(UserResponse source, @MappingTarget UserEntity target);
//
//    default UpdateUserResponse mapperToUpdateUserResponseFrom(UserResponse source){
//        return toUpdateUserResponse(SuccessResponse.CODE, SuccessResponse.MESSAGE, source);
//    }
//
//    UpdateUserResponse toUpdateUserResponse(String code, String message, UserResponse userResponse);
//
//    default UserResponse mapperToUserResponseFrom(UpdateUserRequest source){
//        UserResponse target = new UserResponse();
//        target.setUserId(source.getUserId());
//        target.setUserName(source.getUserName());
//        target.setPassword(source.getPassword());
//        target.setName(source.getName());
//        target.setLastName(source.getLastName());
//        target.setEmail(source.getEmail());
//        return target;
//    }
//}