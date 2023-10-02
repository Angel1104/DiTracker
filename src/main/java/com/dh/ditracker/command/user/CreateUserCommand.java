package com.dh.ditracker.command.user;

import com.dh.ditracker.api.request.user.CreateUserRequest;
import com.dh.ditracker.api.response.user.CreateUserResponse;
import com.dh.ditracker.command.AbstractCommand;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mapstruct.Mapper;
@Slf4j
@Service
public final class CreateUserCommand extends AbstractCommand {
    @Setter
    private CreateUserRequest input;
    @Getter
    private CreateUserRequest output;

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public CreateUserCommand(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }
    @Override
    protected void onExecute() {
        log.info("CreateUserCommand - Execute");
        UserResponse userResponse = userMapper.mapperToUserResponseFrom(this.input);
        userResponse = this.userService.saveUser(userResponse);
        this.output = userMapper.mapperToCreateUserResponseFrom(userResponse);
    }

    @Override
    public void postExecute() {
        log.info("CreateUserCommand - PreExecute");
    }

    @Override
    public void preExecute() {
        log.info("CreateUserCommand - PostExecute");
    }
}
