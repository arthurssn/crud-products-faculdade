package com.crud.productscrud.services;

import com.crud.productscrud.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryService extends JpaRepository<Category, Long> {
}
