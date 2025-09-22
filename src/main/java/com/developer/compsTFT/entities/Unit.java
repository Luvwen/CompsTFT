package com.developer.compsTFT.entities;

import jakarta.persistence.*;
import lombok.Data;

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "insertUnitsDb",
                procedureName = "insert_units",
                resultClasses = {Unit.class},
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "characterPath", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "characterId", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "rarity", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "displayName", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "iconPath", type = String.class)
                })
})
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
