package com.sistema.inventario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "street address is required")
    @Size(max = 100,message = "Street address max 100 characters")
    private String streetAddress;
    @NotBlank(message = "city is required")
    @Size(max = 100,message = "city max 100 characters")
    private String city;
    @NotBlank(message = "state is required")
    @Size(max = 100,message = "state max 100 characters")
    private String state;
    @NotBlank(message = "postal code is required")
    @Size(min = 1, max = 10,message = "postal  min 1 max 10 characters")
    private String postalCode;
    @JsonIgnore
    private Boolean status = Boolean.TRUE;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private  UserModel user;

}
