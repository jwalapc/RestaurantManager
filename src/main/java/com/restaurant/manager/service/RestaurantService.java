package com.restaurant.manager.service;

import com.restaurant.manager.entity.Restaurant;
import com.restaurant.manager.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    // Implement business logic
}
