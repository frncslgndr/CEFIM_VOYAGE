package com.example.demo.service;


import com.example.demo.entity.Accommodation;
import com.example.demo.exception.AccommodationException;
import com.example.demo.repository.AccommodationRepository;
import com.example.demo.service.interfaces.CrudServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor         // utilisation de lombok pour construire le constructeur
public class AccommodationService implements CrudServiceInterface<Accommodation> {
    private AccommodationRepository accommodationRepository;
    @Override
    public void create(Accommodation accommodation) {
        accommodationRepository.save(accommodation);
    }

    @Override
    public List<Accommodation> list() {

        return accommodationRepository.findAll();
    }

    @Override
    public Accommodation read(int id) throws AccommodationException {
        return accommodationRepository.findById(id)
                .orElseThrow(
                        () -> new AccommodationException("Accommodation not found")
        );
    }

    @Override
    public void update(int id, Accommodation object) throws Exception {

    }

    @Override
    public void delete(int id) throws Exception {

    }
}
