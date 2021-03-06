package com.example.adminportal.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "platnosc")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PLATNOSC")
    private int id;

    @Column(name = "typ")
    private String type;

    @Column(name = "nazwa_karty")
    private String cardName;

    @Column(name = "numer_karty")
    private String cardNumber;

    @Column(name = "miesiac")
    private int expiryMonth;

    @Column(name = "rok")
    private int expiryYear;

    @Column(name = "cvc")
    private int cvc;

    @Column(name = "imie_nazwisko_wlasciciela")
    private String holderName;

    @OneToOne
    private Order order;
}
