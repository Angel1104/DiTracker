package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "activityRegistryEntity_")
public class ActivityRegistryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_activity_registry_", nullable = false)
    private Integer idActivityRegistry;

    @ManyToOne
    @JoinColumn(name = "id_project_", insertable = false, updatable = false)
    private ProjectEntity projectId;

    @ManyToOne
    @JoinColumn(name = "id_team_", insertable = false, updatable = false)
    private TeamEntity team;

    @ManyToOne
    @JoinColumn(name = "id_activity_", insertable = false, updatable = false)
    private ActivityEntity activity;

    @ManyToOne
    @JoinColumn(name = "id_tracker_user_", insertable = false, updatable = false)
    private TrackerUserEntity user;

    @Column(name = "initial_date_")
    private Timestamp initialDate;

    @Column(name = "final_date_")
    private Timestamp finalDate;


}