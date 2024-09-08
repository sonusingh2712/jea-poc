package com.graphql.sb.controller;

import com.graphql.sb.entities.Product;
import com.graphql.sb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


/**
 * We've replaced @RestController with @Controller in graphql.
 *
 * For all get-mapping urls we use @GetMapping annotation in Rest-Controller
 * But in graphql in place of that we'll use @QueryMapping.
 * So we've replaced all @GetMapping with @QueryMapping.
 *
 * In place of @PathVariable, we'll use @Argument in graphql.
 */

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @QueryMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @QueryMapping
    public List<Product> getAllProductsByCategory(@Argument String category){
        return service.getProductByCategory(category);
    }

    // Sales Team wants to update stock after item sell.
    @MutationMapping
    public Product updateStockAfterSale(@Argument int id, @Argument int stockSold){
        return service.updateStock(id, stockSold);
    }

    @MutationMapping
    public Product updateStockAfterShipment(@Argument int id, @Argument int shipmentStock){
        return service.updateStockAfterShipment(id, shipmentStock);
    }
}
