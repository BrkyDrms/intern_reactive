package com.etiya.intern.controller;

import com.etiya.intern.entity.UserEntity;
import com.etiya.intern.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public ResponseEntity<Flux<UserEntity>> getAllUsers() {
        Flux<UserEntity> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }
}
