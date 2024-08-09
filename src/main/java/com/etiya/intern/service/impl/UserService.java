package com.etiya.intern.service.impl;

import com.etiya.intern.converter.UserConverter;
import com.etiya.intern.entity.UserEntity;
import com.etiya.intern.repository.UserRepository;
import com.etiya.intern.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public Flux<UserEntity> getAllUser() {
        return userRepository.findAll();
    }
}
