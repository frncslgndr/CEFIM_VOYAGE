package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class AccommodationDTO {
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String address;

    private String phone = null;

    private int price = 0;

    @NotNull
    private Date start;

    @NotNull
    private Date end;
}