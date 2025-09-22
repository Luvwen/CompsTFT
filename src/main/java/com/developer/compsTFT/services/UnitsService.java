package com.developer.compsTFT.services;

import com.developer.compsTFT.beans.UnitRequest;
import com.developer.compsTFT.entities.Unit;
import com.developer.compsTFT.repositories.UnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitsService {
    private UnitsRepository unitsRepository;

    @Autowired
    public UnitsService(UnitsRepository unitsRepository){
        this.unitsRepository = unitsRepository;
    }

    public String insertUnitsDb(List<UnitRequest> unitsRequest){
        try{
            List<Unit> units = unitsRequest.stream().map(this::mapToEntity).toList();
            for (Unit unit : units) {
                unitsRepository.setUnits(unit);
            }

            return "Ok";
        } catch (Exception e){
            return "No funciona xd";
        }
    }

    private Unit mapToEntity(UnitRequest dto){
        Unit unit = new Unit();
        UnitRequest.CharacterRecord record = dto.getCharacterRecord();

        unit.setCharacterPath(record.getPath());
        unit.setCharacterId(record.getCharacterId());
        unit.setRarity(record.getRarity());
        unit.setDisplayName(record.getDisplayName());
        unit.setIconPath(record.getSquareIconPath());

        return unit;
    }
}
