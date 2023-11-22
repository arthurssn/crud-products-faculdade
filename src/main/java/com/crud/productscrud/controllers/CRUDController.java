package com.crud.productscrud.controllers;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public abstract class CRUDController<T> {
    private final JpaRepository<T, Long> service;

    public CRUDController(JpaRepository<T, Long> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> getAll() {
        List<T> items = service.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
