package com.sistema.inventario.repository;

import com.sistema.inventario.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository  extends CrudRepository <UserModel, Long> {
    List<UserModel> findByFirstNameAndLastName(String firstName, String lastName);

}
