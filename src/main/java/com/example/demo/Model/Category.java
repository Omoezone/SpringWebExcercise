package com.example.demo.Model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToMany
    Set<Product> products;
}
