package com.springdemo.springd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

public class Product {

    private int prodId;
    private String name;
    private int price;
}
