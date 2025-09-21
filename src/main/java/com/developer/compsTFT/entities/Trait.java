package com.developer.compsTFT.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Trait")
@Table(name = "traits",
uniqueConstraints = {
        @UniqueConstraint(
                name = "PK_trait",
                columnNames = { "display_name", "trait_set" }
        )
})
public @Data class Trait  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trait")
    private Integer idTrait;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "trait_id")
    private String traitId;
    @Column(name = "trait_set")
    private String traitSet;
    @Column(name = "icon_path")
    private String iconPath;
    @Column(name = "tooltip_path")
    private String tooltip_path;
}
