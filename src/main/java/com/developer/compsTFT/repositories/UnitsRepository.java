package com.developer.compsTFT.repositories;

import com.developer.compsTFT.entities.Unit;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UnitsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public int setUnits(Unit unit){
        StoredProcedureQuery spq = this.entityManager.createNamedStoredProcedureQuery("insertUnitsDb");

        try {
            setParamsStoredProcedure(unit, spq);
            spq.execute();
        } catch (PersistenceException e){
            throw e;
        }

        return 0;
    }

    private StoredProcedureQuery setParamsStoredProcedure(Unit unit, StoredProcedureQuery spq){
        spq.setParameter("characterPath", unit.getCharacterPath());
        spq.setParameter("characterId", unit.getCharacterId());
        spq.setParameter("rarity", unit.getRarity());
        spq.setParameter("displayName", unit.getDisplayName());
        spq.setParameter("iconPath", unit.getIconPath());

        return spq;
    }
}
