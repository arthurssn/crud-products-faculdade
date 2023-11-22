package com.crud.productscrud.controllers;

import com.crud.productscrud.models.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {
    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        return null;
    }

    
}
