package com.developer.compsTFT.controllers;

import com.developer.compsTFT.beans.UnitRequest;
import com.developer.compsTFT.entities.Unit;
import com.developer.compsTFT.repositories.UnitsRepository;
import com.developer.compsTFT.services.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/units")
public class UnitsController {
    public final UnitsService unitsService;
    public final UnitsRepository unitsRepository;

    @Autowired
    public UnitsController(UnitsService unitsService, UnitsRepository unitsRepository){
        this.unitsService = unitsService;
        this.unitsRepository = unitsRepository;
    }

    @PostMapping
    public String setUnitsDb(@RequestBody List<UnitRequest> unitsRequest){

        return unitsService.insertUnitsDb(unitsRequest);
    }
}
