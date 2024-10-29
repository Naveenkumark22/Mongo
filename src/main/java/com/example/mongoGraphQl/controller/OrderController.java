package com.example.mongoGraphQl.controller;

import com.example.mongoGraphQl.model.OrderDetails;
import com.example.mongoGraphQl.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderDetailsService service;

    @PostMapping("order/save")
    public OrderDetails saveOrder(@RequestBody  OrderDetails order){
            return  service.saveOrderDetails(order);
    }

    @GetMapping("order/getbyid")
    public Optional<OrderDetails> getOrderBId(@RequestBody OrderDetails order)
    {
        return service.getOrderById(order.getId());
    }
}
