package com.sistema.inventario.controller;

import com.sistema.inventario.model.AddressModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    String firstName;
    String lastName;
    List<AddressModel> address;
    String email;
    String phone;
    String password;
    String document;
}
