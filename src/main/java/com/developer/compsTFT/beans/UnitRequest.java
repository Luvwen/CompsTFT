package com.developer.compsTFT.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UnitRequest {
    private String name;

    @JsonProperty("character_record")
    private CharacterRecord characterRecord;

    @Data
    public static class CharacterRecord {
        private String path;

        @JsonProperty("character_id")
        private String characterId;

        private Integer rarity;

        @JsonProperty("display_name")
        private String displayName;

        private List<String> traits;

        @JsonProperty("squareIconPath")
        private String squareIconPath;
    }
}
