package com.crud.productscrud.services;

import com.crud.productscrud.models.Product;
import com.crud.productscrud.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends CRUDService<Product> {
    public ProductService(ProductRepository repository) {
        super(repository);
    }

    @Override
    protected void updateFields(Product existingItem, Product newItem) {
        existingItem.setName(newItem.getName());
        existingItem.setCategory(newItem.getCategory());
        existingItem.setPrice(newItem.getPrice());
    }
}
