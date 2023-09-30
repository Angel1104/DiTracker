package com.dh.ditracker.model.domain.tracker;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "team_")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_team_", nullable = false)
    private Integer idTeam;

    @Column(name = "name_", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tracker_user_")
    private TrackerUserEntity lead;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teamUsers")
    private List<TrackerUserEntity> members;




    @ManyToOne
    @JoinColumn(name = "id_project_", insertable = false, updatable = false)
    private ProjectEntity projectId;

    @OneToMany(mappedBy = "team")
    private List<ActivityRegistryEntity> activityRegistryEntitiesList;
}