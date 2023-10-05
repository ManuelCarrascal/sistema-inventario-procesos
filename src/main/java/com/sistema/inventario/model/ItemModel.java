package com.sistema.inventario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.math.BigDecimal;

@Entity
@Table(name = "item")
@Data
public class ItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private BigDecimal price;
    private String provider;
    private String status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
}
