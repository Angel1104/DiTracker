package com.dh.ditracker.controller;

import com.dh.ditracker.api.request.user.*;
import com.dh.ditracker.api.response.user.DeleteUserResponse;
import com.dh.ditracker.command.user.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public final class UserController {
    private final DeleteUserCommand deleteUserCommand;

    @DeleteMapping(value = "/DeleteUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public DeleteUserResponse updateUser(@Valid @RequestBody DeleteUserRequest request) {
        deleteUserCommand.setInput(request);
        deleteUserCommand.execute();
        return deleteUserCommand.getOutput();
    }
}
