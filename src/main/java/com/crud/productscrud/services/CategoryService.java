package com.crud.productscrud.services;

import com.crud.productscrud.models.Category;
import com.crud.productscrud.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends CRUDService<Category> {
    public CategoryService(CategoryRepository repository) {
        super(repository);
    }

    @Override
    protected void updateFields(Category existingItem, Category newItem) {
        existingItem.setName(newItem.getName());
        existingItem.setProducts(newItem.getProducts());
    }
}
