package com.dh.ditracker.model.domain.security;

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
    @Column(name = "avatarId_")
    private Integer avatarId;
    @Column(name = "email_")
    private String email;
}
