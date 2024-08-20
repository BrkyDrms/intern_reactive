package com.etiya.intern_reactive.service;

import com.etiya.intern_reactive.entity.UserReactiveEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserReactiveService {
    Flux<UserReactiveEntity> getAllUser();
}
