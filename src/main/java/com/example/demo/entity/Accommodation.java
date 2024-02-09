package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor                              // constructeur sans paramètres
@Entity                                         // présise que l'entité représente une table en base de données
@Table(name = "accommodation")                  // nom de la table
public class Accommodation {
    @Id                                         // identifiant de l'entité unique
    @GeneratedValue (strategy = IDENTITY)       // auto-increment
    private Long id;
    @Column(name = "name")                      // nom de la colonne en cas de personnalisation
    private String name;
    private String address;
    private String phone;
    private int price;
    private Date start;
    private Date end;
}
