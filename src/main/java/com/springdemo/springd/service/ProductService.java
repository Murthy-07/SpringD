package com.springdemo.springd.service;

import com.springdemo.springd.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(101,"Camera",23000),
            new Product(102,"Iphone",50000));

    public List<Product> getProducts(){
        return products;
    }
}
