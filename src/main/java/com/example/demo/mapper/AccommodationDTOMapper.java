package com.example.demo.mapper;

import com.example.demo.dto.AccommodationDTO;
import com.example.demo.entity.Accommodation;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccommodationDTOMapper {
    public AccommodationDTO fromAccommodation(Accommodation accommodation) {
        AccommodationDTO accommodationDTO = new AccommodationDTO();

//        accommodationDTO.setAddress(accommodation.getAddress());

        BeanUtils.copyProperties(accommodation, accommodationDTO);
        return accommodationDTO;
    }

    public Accommodation fromAccommodationDTO(AccommodationDTO accommodationDTO) {
        Accommodation accommodation = new Accommodation();

        BeanUtils.copyProperties(accommodationDTO, accommodation);
        return accommodation;
    }


}
