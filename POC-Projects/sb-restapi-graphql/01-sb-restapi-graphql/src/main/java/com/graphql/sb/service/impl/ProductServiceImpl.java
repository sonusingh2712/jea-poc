package com.graphql.sb.service.impl;

import com.graphql.sb.entities.Product;
import com.graphql.sb.repository.ProductRepository;
import com.graphql.sb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return repository.findByCategory(category);
    }


}
