package com.dh.ditracker.model.repository;

import com.dh.ditracker.model.domain.UserEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    Optional<UserEntity> findByRegistrarionId(@NonNull Integer userId);

}
