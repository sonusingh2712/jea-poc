package com.graphql.sb.service.impl;

import com.graphql.sb.entities.Product;
import com.graphql.sb.repository.ProductRepository;
import com.graphql.sb.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
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

    @Override
    public Product updateStock(int id, int soldFromStock){
        Product existingProduct = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product is not available in DB"));
        existingProduct.setStock(existingProduct.getStock() - soldFromStock);
        return repository.save(existingProduct);
    }

    @Override
    public Product updateStockAfterShipment(int id, int updatedStock) {
        Product existingProduct = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product No Found Exception"));
        existingProduct.setStock(existingProduct.getStock() + updatedStock);
        return repository.save(existingProduct);
    }


}
