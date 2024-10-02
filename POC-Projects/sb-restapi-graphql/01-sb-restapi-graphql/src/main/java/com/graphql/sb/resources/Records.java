package com.graphql.sb.resources;

import com.graphql.sb.entities.Product;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@NoArgsConstructor
public class Records {


    public List<Product> generateProductsRecord(){

        return Stream.of(
                new Product("Iphone 15 Pro Mobile", "Electronics", 125000.00f, 20),
                new Product("MAC BOOK PRO LAPTOP", "Electronics", 315000.00f, 5),
                new Product("Apple Smart Watch", "Electronics", 45000.00f, 30),
                new Product("Office Chair", "Furniture", 8000.00f, 50),
                new Product("Laptop Desk", "Furniture", 6000.00f, 45),
                new Product("NOTE-BOOK", "Stationary", 600.00f, 200),
                new Product("PENCIL", "Stationary", 5.00f, 1500),
                new Product("Desk Lamp", "Furniture", 2300.00f, 80),
                new Product("Water Bottle", "Accessories", 600.00f, 300),
                new Product("Coffee Mug", "Accessories", 400.00f, 250)
        ).collect(Collectors.toList());
    }
}
