package com.sistema.inventario.repository;

import com.sistema.inventario.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<CategoryModel,Long> {
}
