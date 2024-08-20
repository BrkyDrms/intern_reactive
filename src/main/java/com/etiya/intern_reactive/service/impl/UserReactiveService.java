package com.etiya.intern_reactive.service.impl;

import com.etiya.intern_reactive.converter.UserReactiveConverter;
import com.etiya.intern_reactive.entity.UserReactiveEntity;
import com.etiya.intern_reactive.repository.UserReactiveRepository;
import com.etiya.intern_reactive.service.IUserReactiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;


@Service
public class UserReactiveService implements IUserReactiveService {

    @Autowired
    private UserReactiveRepository userRepository;

    @Autowired
    private UserReactiveConverter userConverter;


    @Override
    public Flux<UserReactiveEntity> getAllUser() {
        return userRepository.findAll()
                .delayElements(Duration.ofMillis(100))
                .log("repository");

    }
}