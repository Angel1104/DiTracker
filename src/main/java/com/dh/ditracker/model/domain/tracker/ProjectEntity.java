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
    @Column(name = "id_project_", nullable = false)
    private Integer idProject;

    @Column(name = "name_")
    private String name;

    @Column(name = "description_")
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tracker_user_")
    private TrackerUserEntity manager;

    @Column(name = "isDeleted_")
    private Boolean isDeleted;



    @OneToMany(mappedBy = "projectId")
    private List<TeamEntity> teamEntityList;

    @OneToMany(mappedBy = "projectId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = TrackerUserEntity.class)
    private List<ActivityRegistryEntity>  activityRegistryList;
}
