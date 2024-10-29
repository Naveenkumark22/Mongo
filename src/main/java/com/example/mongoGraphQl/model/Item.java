package com.example.mongoGraphQl.model;

import lombok.Data;

@Data
public class Item {
    private String productId;
    private int quantity;
    private double price;
}
