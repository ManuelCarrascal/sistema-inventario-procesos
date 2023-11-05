package com.sistema.inventario.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    @Column(unique = true)
    private String nameCategory;
    private String description;
    private String status;
    private String displayOrder;
}

