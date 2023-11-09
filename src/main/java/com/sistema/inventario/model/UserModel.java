package com.sistema.inventario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "firstName is required")
    @Size(min= 1, max = 100,message = "firstName max 100 characters")
    private String firstName;
    private String lastName;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<AddressModel> address;
    @NotBlank(message = "email is required")
    @Email
    private String email;
    @NotBlank(message = "phone is required")
    @Size(min= 1, max = 16,message = "phone min 1 and max 16 characters")
    private String phone;
    @NotBlank(message = "password is required")
    @Size(min= 8, max = 20,message = "password min 8 and max 20 characters")
    private String password;
    @NotBlank(message = "document is required")
    @Size(min= 5, max = 20,message = "document min 5 and max 20 characters")
    private String document;
}
