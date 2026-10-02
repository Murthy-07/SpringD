package com.springdemo.springd.controller;

import com.springdemo.springd.model.Product;
import com.springdemo.springd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
       @Autowired
       ProductService service;
       @RequestMapping("/product")
      public List<Product> getProducts(){
          return service.getProducts();
      }
}
