package com.graphql.sb.service;

import com.graphql.sb.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    List<Product> getProductByCategory(String category);
}
