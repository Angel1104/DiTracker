package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "trackerUser_")
public class TrackerUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Column(name = "userId_")
    private Long userId;
    @Column(name = "userName_")
    private String userName;
    @Column(name = "email_")
    private String email;
}
