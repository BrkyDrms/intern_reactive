package com.etiya.intern_reactive.converter;

import com.etiya.intern_reactive.entity.UserReactiveEntity;
import com.etiya.intern_reactive.entity.datatransfer.UserReactiveDataTransfer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class UserReactiveConverter {

    public Flux<UserReactiveDataTransfer> userEntityListConvertToUserDataTransferList(Flux<UserReactiveEntity> userEntityList){
        return userEntityList.map(userEntity -> new UserReactiveDataTransfer(userEntity.getName()));
    }
}
