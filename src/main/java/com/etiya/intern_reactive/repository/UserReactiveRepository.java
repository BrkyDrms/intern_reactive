package com.etiya.intern_reactive.repository;

import com.etiya.intern_reactive.entity.UserReactiveEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReactiveRepository extends ReactiveCrudRepository<UserReactiveEntity, Long> {
}
