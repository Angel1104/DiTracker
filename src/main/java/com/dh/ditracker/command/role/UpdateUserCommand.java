package com.dh.ditracker.command.role;

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
    public UpdateUserCommand (UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @Override
    protected void onExecute(){
        log.info("UpdateUserCommand - Execute");
        //UserResponse
    }
}
