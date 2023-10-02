package com.dh.ditracker.command.user;

import com.dh.ditracker.api.request.user.UpdateUserRequest;
import com.dh.ditracker.api.response.user.UpdateUserResponse;
import com.dh.ditracker.api.response.user.UserResponse;
import com.dh.ditracker.command.AbstractCommand;
import com.dh.ditracker.model.mapper.UserMapper;
import com.dh.ditracker.service.UserService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DiTracker
 * @apiNote Este servicio permite actualizar un usuario en la base de datos de MySQL
 */
@Slf4j
@Service
public final class UpdateUserCommand extends AbstractCommand {
    @Setter
    private UpdateUserRequest input;
    @Getter
    private UpdateUserResponse output;

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UpdateUserCommand (UserMapper userMapper, UserService userService){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @Override
    protected void onExecute(){
        log.info("UpdateUserCommand - Execute");
        UserResponse userResponse = userMapper.mapperToUserResponseFrom(this.input);
        this.userService.updateUser(userResponse);
        this.output = this.userMapper.mapperToUpdateUserResponseFrom(userResponse);
    }

    @Override
    public void postExecute(){
        log.info("UpdateUserCommand - PostExecute");
    }

    @Override
    public void preExecute(){
        log.info("UpdateUserCommand - PreExecute");
    }
}
