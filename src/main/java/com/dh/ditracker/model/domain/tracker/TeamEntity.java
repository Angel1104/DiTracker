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
    @Column(name = "id_", nullable = false)
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teamEntity")
    private List<TrackerUserEntity> members;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teamEntity")
    private TrackerUserEntity lead;
}