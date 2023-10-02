package com.dh.ditracker.command.user;

import com.dh.ditracker.api.request.user.DeleteUserRequest;
import com.dh.ditracker.api.response.user.DeleteUserResponse;
import com.dh.ditracker.command.AbstractCommand;
import com.dh.ditracker.service.UserService;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class DeleteUserCommand extends AbstractCommand {
    @Setter
    private DeleteUserRequest input;
    @Getter
    private DeleteUserResponse output;

    private final UserService userService;

    @Autowired
    public DeleteUserCommand(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void onExecute() {
        log.info("DeleteUserCommand - Execute");
        this.userService.deleteUser(this.input.getUserId());
        this.output = new DeleteUserResponse();
    }

    @Override
    public void postExecute() {
        log.info("DeleteUserCommand - PostExecute");
    }

    @Override
    public void preExecute() {
        log.info("DeleteUserCommand - PreExecute");
    }

}
