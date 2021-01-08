package com.example.adminportal.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity(name = "magazyny")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MAGAZYNU")
    private int warehouseId;

    @Column(name = "miejscowosc")
    private String locality;

    @Column(name = "adres")
    private String address;

    @Column(name = "pojemnosc")
    private int capacity;
}
