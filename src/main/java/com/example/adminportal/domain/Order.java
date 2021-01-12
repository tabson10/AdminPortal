package com.example.adminportal.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "zamowienia")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "data_zamowienia")
    private Date orderDate;

    @Column(name = "data_wysylki")
    private Date shippingDate;

    @Column(name = "rodzaj_dostawy")
    private String shippingMethod;

    @Column(name = "status_zamowienia")
    private String orderStatus;

    @Column(name = "cena")
    private BigDecimal orderTotal;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<CartItem> cartItemList;

    @OneToOne(cascade = CascadeType.ALL)
    private ShippingAddress shippingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;

    @OneToOne(cascade = CascadeType.ALL)
    private Billing billing;

    @ManyToOne
    private User user;

}
