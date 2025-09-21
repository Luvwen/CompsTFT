package com.developer.compsTFT.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity(name = "Unit")
@Table(name = "units")
public @Data class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unit")
    private Integer idUnit;
    @Column(name = "character_path")
    private String characterPath;
    @Column(name = "character_id")
    private String characterId;
    @Column(name = "rarity")
    private Integer rarity;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "icon_path")
    private String iconPath;
}
