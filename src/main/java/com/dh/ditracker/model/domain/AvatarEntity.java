package com.dh.ditracker.model.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "avatar_")
public class AvatarEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Column(name = "fileName_")
    private String fileName;
    @Column(name = "image_")
    private String image;

    @OneToOne(mappedBy = "avatarEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private UserEntity userEntity;
}
