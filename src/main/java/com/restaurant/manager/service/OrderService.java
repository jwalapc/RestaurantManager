package com.restaurant.manager.service;

import com.restaurant.manager.entity.Order;
import com.restaurant.manager.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Implement business logic
}
