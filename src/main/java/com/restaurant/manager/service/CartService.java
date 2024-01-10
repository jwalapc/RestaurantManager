package com.restaurant.manager.service;

import com.restaurant.manager.entity.Cart;
import com.restaurant.manager.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    // Implement business logic
}
