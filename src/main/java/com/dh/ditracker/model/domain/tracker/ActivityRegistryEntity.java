package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "activityRegistryEntity_")
public class ActivityRegistryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Column(name = "name_")
    private String registrationId;
    @Column(name = "description_")
    private String name;
    @Column(name = "manager_")
    private Boolean status;
    @Column(name = "isDeleted_")

    @OneToMany(mappedBy = "ActivityRegistryEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = ActivityEntity.class)
    private List<ActivityEntity> locationEntityList;
}