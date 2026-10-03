package com.springdemo.springd.service;

import com.springdemo.springd.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Camera", 23000),
            new Product(102, "Iphone", 50000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductId(int productId) {
        return products.stream().
                filter(p -> p.getProdId() == productId).
                findFirst().get();
    }

    public void addProduct(Product prod) {
        products.add(prod);

    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                index = i;
                products.set(index, prod);
            }
        }
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;

                products.remove(index);
            }
        }
    }
}
