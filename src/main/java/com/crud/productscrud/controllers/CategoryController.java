package com.crud.productscrud.controllers;

import com.crud.productscrud.models.Category;
import com.crud.productscrud.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
public class CategoryController extends CRUDController<Category> {
    @Autowired
    public CategoryController(CategoryService service) {
        super(service);
    }

    @Override
    protected void updateFields(Category existingItem, Category newItem) {
        existingItem.setName(newItem.getName());
        existingItem.setProducts(newItem.getProducts());
    }
}
