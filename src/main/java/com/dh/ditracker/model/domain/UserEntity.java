package com.dh.ditracker.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user_")
public class UserEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Column(name = "userName_")
    private String userName;
    @Column(name = "password_")
    private String password;
    @Column(name = "name_")
    private String name;
    @Column(name = "lastName_")
    private String lastName;
    @Column(name = "email_")
    private String email;

    @JoinColumn(name = "avatarId_")
    @OneToOne(fetch = FetchType.LAZY)
    private AvatarEntity avatarEntity;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = RoleEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id_")
    private RoleEntity roleEntity;
}
