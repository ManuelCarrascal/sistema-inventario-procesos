package com.sistema.inventario.service;

import com.sistema.inventario.model.CategoryModel;
import com.sistema.inventario.repository.CategoryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepositories categoryRepositories;

    public CategoryModel createItem(CategoryModel category){
        return categoryRepositories.save(category);
    }

    public CategoryModel getItemByid(Long id){
        return categoryRepositories.findById(id).get();
    }

    public CategoryModel updateItem(CategoryModel category, Long id){
        if(categoryRepositories.existsById(id)){
            CategoryModel categoryDB = categoryRepositories.findById(id).get();
            categoryDB.setNameCategory(category.getNameCategory());
            categoryDB.setDescription(category.getDescription());
            categoryDB.setStatus(category.getStatus());
            categoryDB.setDisplayOrder(category.getDisplayOrder());

            return categoryRepositories.save(categoryDB);
        }
        return null;
    }

    public Boolean deleteCategoryById(Long id){
        if(categoryRepositories.existsById(id)){
            categoryRepositories.deleteById(id);
            return true;
        }
        return false;
    }

    public List<CategoryModel> findAllCategory(){
        return (List<CategoryModel>) categoryRepositories.findAll();
    }
}
