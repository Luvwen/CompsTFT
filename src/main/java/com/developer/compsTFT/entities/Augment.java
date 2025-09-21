package com.developer.compsTFT.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Augment")
@Table(name = "augments")
public @Data class Augment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_augment")
    private Integer idAugment;
    @Column(name = "api_name")
    private String apiName;
    @Column(name = "augment_desc")
    private String augmentDesc;
    @Column(name = "augment_from")
    private String augmentFrom;
    @Column(name = "icon")
    private String icon;
    @Column(name = "augment_name")
    private String augmentName;
    @Column(name = "is_unique")
    private Boolean isUnique;
}
