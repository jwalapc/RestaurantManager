package com.restaurant.manager.service;

import com.restaurant.manager.entity.Item;
import com.restaurant.manager.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    // Implement business logic
}
