package com.example.mongoGraphQl.repository;


import com.example.mongoGraphQl.model.OrderDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends MongoRepository<OrderDetails,String> {
}
