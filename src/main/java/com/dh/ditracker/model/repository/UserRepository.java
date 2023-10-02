package com.dh.ditracker.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByRegistrationId(@NonNull Integer characterId);

    Optional<UserEntity> findFirstByOrderByRegistrationIdDesc();

    @Query(value = "SELECT B FROM CharacterEntity A JOIN A.locationEntityList B WHERE A.id = ?1")
    List<LocationEntity> getLocationByCharacterId(@NonNull Integer characterId);

    @Query(value = "SELECT A FROM CharacterEntity A WHERE LOWER(A.name) LIKE LOWER(?1) AND LOWER(A.status) LIKE LOWER(?2) AND LOWER(A.species) LIKE LOWER(?3) AND LOWER(A.gender) LIKE LOWER(?4)")
    List<UserEntity> findBy(@NonNull String name, @NonNull String status, @NonNull String species, @NonNull String gender);

}
