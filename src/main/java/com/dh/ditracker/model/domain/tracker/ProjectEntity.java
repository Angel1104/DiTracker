package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "project_")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Column(name = "name_")
    private String name;
    @Column(name = "description_")
    private String description;
    @Column(name = "isDeleted_")
    private Boolean isDeleted;
    @OneToMany(mappedBy = "projectEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = TrackerUserEntity.class)
    private List<TrackerUserEntity> locationEntityList;
}
