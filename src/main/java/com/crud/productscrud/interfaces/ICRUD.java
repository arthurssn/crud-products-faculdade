package com.crud.productscrud.interfaces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
    List<T> getAll();

    Optional<T> getById(@PathVariable Long id);

    T store(@RequestBody T item);

    T update(@PathVariable Long id, @RequestBody T item);

    Void delete(@PathVariable Long id);
}
