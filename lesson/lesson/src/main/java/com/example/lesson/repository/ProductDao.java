package com.example.lesson.repository;

import com.example.lesson.entity.ProductRecord;

import java.util.List;

public interface ProductDao {
    List<ProductRecord> findAll();

    ProductRecord findById(int id);

    int insert(ProductRecord productRecord);
    int update(ProductRecord productRecord);

    int delete(int id);
}
