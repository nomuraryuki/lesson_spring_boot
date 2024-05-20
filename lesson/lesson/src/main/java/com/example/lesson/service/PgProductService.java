package com.example.lesson.service;

import com.example.lesson.Exception.ProductNotFoundException;
import com.example.lesson.entity.ProductRecord;
import com.example.lesson.repository.ProductDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PgProductService implements ProductService{

    private ProductDao productDao;


    @Override
    public List<ProductRecord> findAll() {
        return productDao.findAll();
    }

    @Override
    public ProductRecord findById(int id) {

        if(productDao.findById(id)==null)throw new ProductNotFoundException();;

        return productDao.findById(id);
    }

    @Override
    public int insert(ProductRecord productRecord) {
        return productDao.insert(productRecord);
    }

    @Override
    public int update(ProductRecord productRecord) {
        return productDao.update(productRecord);
    }

    @Override
    public int delete(int id) {
        return productDao.delete(id);
    }
}
