package com.graphql.sb.resources;

import com.graphql.sb.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppStartUpData {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    private void loadProductRecords(){
        Records records = new Records();
        productRepository.saveAll(records.generateProductsRecord());
    }
}
