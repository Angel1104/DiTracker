package com.dh.ditracker.model.repository;

import com.dh.ditracker.model.domain.UserEntity;
import org.springframework.lang.NonNull;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findById(@NonNull Integer userId);

    Optional<UserEntity> findFirstByOrderByIdDesc();

}
