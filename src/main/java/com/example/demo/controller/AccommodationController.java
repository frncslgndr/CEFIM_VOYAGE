package com.example.demo.controller;


import com.example.demo.controller.advice.CrudControllerAdviceInterface;
import com.example.demo.entity.Accommodation;
import com.example.demo.exception.AccommodationException;
import com.example.demo.service.AccommodationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path= "accommodation")     // nom de la route dans l'API
@RestController
//@AllArgsConstructor                           // utilisation de lombok pour construire le constructeur

public class AccommodationController implements CrudControllerAdviceInterface<Accommodation> {
    private AccommodationService accommodationService;

    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @Override
    public void create( Accommodation accommodation) {
        accommodationService.create(accommodation);
    }

    @Override
    public List<Accommodation> reads() {

        return accommodationService.list();
    }

    @Override
    public Accommodation read(int id) throws AccommodationException {
        return accommodationService.read(id);
    }

    @Override
    public void update(int id, Accommodation object) throws Exception {

    }

    @Override
    public void delete(int id) throws Exception {

    }
}
