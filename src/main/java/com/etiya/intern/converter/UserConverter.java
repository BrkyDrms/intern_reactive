package com.etiya.intern.converter;

import com.etiya.intern.entity.UserEntity;
import com.etiya.intern.entity.datatransfer.UserDataTransfer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class UserConverter {

    public Flux<UserDataTransfer> userEntityListConvertToUserDataTransferList(Flux<UserEntity> userEntityList){
        return userEntityList.map(userEntity -> new UserDataTransfer(userEntity.getName()));
    }
}
