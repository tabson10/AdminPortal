package com.example.adminportal.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Data
@Entity(name = "owoc")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_OWOCU")
    private int id;

    @Column(name = "nazwa")
    private String name;

    @Column(name = "ilosc")
    private int quantity;

    @Column(name = "opis", columnDefinition = "text")
    private String description;

    @Transient
    private MultipartFile fruitImage;

}
