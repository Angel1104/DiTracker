package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;

import com.dh.ditracker.util.constant.RequestStatus;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "permissionRequest_")
public class PermissionRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_", nullable = false)
    private Integer id;
    @Column(name = "initialDate_")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp initialDate;
    @Column(name = "endDate_")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp endDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status_")
    private RequestStatus status;
    @Column(name = "isDeleted_")
    private Boolean isDeleted;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TrackerUserEntity requestingUser;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TeamEntity team;
}
