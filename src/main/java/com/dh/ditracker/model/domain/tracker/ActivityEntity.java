package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "activityEntity_")
public class ActivityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Column(name = "name_")
    private String name;
}