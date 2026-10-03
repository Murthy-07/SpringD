package com.springdemo.springd.controller;

import com.springdemo.springd.model.Product;
import com.springdemo.springd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
       @Autowired
       ProductService service;
       @GetMapping("/products")
      public List<Product> getProducts(){
          return service.getProducts();
      }
      @GetMapping("/products/{productId}")
      public Product getProductId(@PathVariable int productId){
           return service.getProductId(productId);
      }
      @PostMapping("products")
      public void addProduct(@RequestBody Product prod){
           System.out.println(prod);
           service.addProduct(prod);
      }
      @PutMapping("/products")
      public void updateProduct(@RequestBody Product prod){
           service.updateProduct(prod);
      }
      @DeleteMapping("/products/{prodId}")
      public void deleteProduct(@PathVariable int prodId){
           service.deleteProduct(prodId);
      }

}
