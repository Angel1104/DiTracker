package com.dh.ditracker.controller;

import com.dh.ditracker.api.response.user.*;
import com.dh.ditracker.api.request.user.*;
import com.dh.ditracker.command.user.UpdateUserCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
public class UserController {
    private final UpdateUserCommand updateUserCommand;

    @Autowired
    public UserController(
            UpdateUserCommand updateUserCommand
    ){
        this.updateUserCommand = updateUserCommand;
    }

    @PutMapping(value = "/UpdateUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UpdateUserResponse updateUser (@Valid @RequestBody UpdateUserRequest request){
        updateUserCommand.setInput(request);
        updateUserCommand.execute();
        return updateUserCommand.getOutput();
    }
}
