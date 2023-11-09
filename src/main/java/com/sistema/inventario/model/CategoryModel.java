package com.sistema.inventario.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    @Column(unique = true)
    @NotBlank(message = "El nombre de la categoría no puede estar vacío")
    @Size(max = 50, min = 3,message = "El nombre de la categoría debe tener tener entre 3 y 50 caracteres")
    private String nameCategory;
    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 300, message = "Maximo 300 caracteres en la descripción")
    private String description;
    @NotBlank(message = "El estado no puede estar vacío")
    private String status;
    @NotBlank(message = "El orden de visualización no puede estar vacío")
    private String displayOrder;
}

