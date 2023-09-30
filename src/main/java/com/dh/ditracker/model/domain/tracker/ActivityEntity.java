package com.dh.ditracker.model.domain.tracker;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "activityEntity_")
public class ActivityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_activity_", nullable = false)
    private Integer idActivity;

    @Column(name = "name_")
    private String name;



    @OneToMany(mappedBy = "activity")
    private List<ActivityRegistryEntity> activityRegistryEntitiesList;
}