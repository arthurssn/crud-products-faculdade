package com.crud.productscrud.controllers;

import com.crud.productscrud.models.Product;
import com.crud.productscrud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController extends CRUDController<Product> {
    @Autowired
    public ProductController(ProductService service) {
        super(service);
    }
}
