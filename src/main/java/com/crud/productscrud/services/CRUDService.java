package com.crud.productscrud.services;

import com.crud.productscrud.interfaces.ICRUD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class CRUDService<T> implements ICRUD<T> {
    private final JpaRepository<T, Long> repository;

    public CRUDService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public T store(T item) {
        return repository.save(item);
    }

    @Override
    public T update(Long id, T item) {
        Optional<T> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            T existingItem = existingItemOptional.get();
            updateFields(existingItem, item);
            return repository.save(existingItem);
        }
        // TODO: lancar excecao adequada
        return null;
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    protected abstract void updateFields(T existingItem, T newItem);
}
