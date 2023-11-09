package com.sistema.inventario.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "El nombre del item no puede estar vacío")
    @Size(min = 3, message = "El nombre del item debe tener mas de 3 caracteres")
    private String name;
    @NotBlank(message = "La descripcion del item no debe estar vacia")
    @Size(max = 300, message = "Solo se permiten 300 caracteres en la descripcion")
    private String description;
    @NotBlank(message = "La cantidad del item no debe estar vacia")
    private int quantity;
    @NotBlank(message = "El precio del item no debe estar vacio")
    private BigDecimal price;
    @NotBlank(message = "El proveedor no debe estar vacio")
    private String provider;
    @NotBlank(message = "El estatus no debe estar vacio")
    private String status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
}
