package com.dh.ditracker.model.domain;

import com.dh.ditracker.util.constant.RoleType;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "role_")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "name_")
    private RoleType name;


    @OneToMany(mappedBy = "roleEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = UserEntity.class)
    private List<UserEntity> userEntityList;
}
