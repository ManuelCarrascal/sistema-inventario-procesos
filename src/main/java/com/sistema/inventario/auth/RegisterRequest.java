package com.sistema.inventario.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
  @NotBlank(message = "First name is required")
    @Size(min= 1, max = 100, message = "First name must be between 1 and 100 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min= 1, max = 100, message = "Last name must be between 1 and 100 characters")
    private String lastName;
    @NotBlank(message = "Phone is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be a valid number of 10 digits")
    private String phone;

    @NotBlank(message = "Document is required")
    @Size(min= 5, max = 20, message = "Document must be between 5 and 20 characters")
    private String document;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Password is required")
    @Size(min = 8, max = 255,message = "password min 8 characters and max 255")
    private String password;
}
