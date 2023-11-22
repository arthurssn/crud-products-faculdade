package com.crud.productscrud.repositories;

import com.crud.productscrud.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
