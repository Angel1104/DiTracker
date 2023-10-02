package com.dh.ditracker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public final class UserController {

    private final CreateUserCommand createUserCommand;

    @PostMapping(value = "/CreateUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreateUserResponse createUser(@Valid @RequestBody CreateUserRequest request) {
        createUserCommand.setInput(request);
        createUserCommand.execute();
        return createUserCommand.getOutput();
    }
}
