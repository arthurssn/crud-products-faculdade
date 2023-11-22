package com.crud.productscrud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
