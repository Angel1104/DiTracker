package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "trackerUser_")
public class TrackerUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tracker_user_", nullable = false)
    private Integer idTrackerUser;

    @Column(name = "userId_")
    private String userId;

    @Column(name = "userName_")
    private String userName;

    @Column(name = "email_")
    private String email;



    @OneToOne(mappedBy = "manager", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private ProjectEntity projectEntity;

    @OneToMany(mappedBy = "user")
    private List<ActivityRegistryEntity> activityRegistryEntitiesList;

    @OneToOne(mappedBy = "lead`", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private TeamEntity teamEntity;

    @ManyToOne
    @JoinColumn(name = "id_team_", insertable = false, updatable = false)
    private TeamEntity teamUsers;
}
