package com.etiya.intern_reactive.controller;

import com.etiya.intern_reactive.entity.UserReactiveEntity;
import com.etiya.intern_reactive.service.IUserReactiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;

@RestController
@RequestMapping("/users")
public class UserReactiveController {

    @Autowired
    private IUserReactiveService userService;

    @GetMapping
    public Flux<UserReactiveEntity> getAllUsers() {
        return userService.getAllUser().log("controller");

    }
}
