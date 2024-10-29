package com.example.mongoGraphQl.service;


import com.example.mongoGraphQl.model.OrderDetails;

import java.util.Optional;

public interface OrderDetailsService {
    Optional<OrderDetails> getOrderById(String id);
    OrderDetails saveOrderDetails(OrderDetails order);
}
