package com.etiya.intern.service;

import com.etiya.intern.entity.UserEntity;
import reactor.core.publisher.Flux;

public interface IUserService {
    Flux<UserEntity> getAllUser();
}
