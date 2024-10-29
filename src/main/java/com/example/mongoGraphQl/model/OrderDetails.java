package com.example.mongoGraphQl.model;


import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("OrderDetails")
public class  OrderDetails {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Field("customerId")
    private String customerId;

    @Field("items")
    private List<Item> items;

    @Field("totalAmount")
    private double totalAmount;

    @Field("orderDate")
    private LocalDateTime orderDate;

    @Field("status")
    private String status;

    @Field("address")
    private Address address;
}
