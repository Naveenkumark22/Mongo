package com.example.mongoGraphQl.service.impl;


import com.example.mongoGraphQl.model.OrderDetails;
import com.example.mongoGraphQl.repository.OrderDetailsRepository;
import com.example.mongoGraphQl.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderDetailsService {

    @Autowired
private OrderDetailsRepository repo;

    public Optional<OrderDetails> getOrderById(String id){
        return repo.findById(id);
    }

    @Override
    public OrderDetails saveOrderDetails(OrderDetails order) {
       return repo.save(order);

    }


}
