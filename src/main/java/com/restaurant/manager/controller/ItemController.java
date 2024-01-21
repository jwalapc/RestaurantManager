package com.restaurant.manager.controller;

import com.restaurant.manager.dto.ItemDTO;
import com.restaurant.manager.entity.Item;
import com.restaurant.manager.entity.Restaurant;
import com.restaurant.manager.repository.ItemRepository;
import com.restaurant.manager.repository.RestaurantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private RestaurantRepository restaurantRepository; // Assuming you have a RestaurantRepository

    

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    }

    @PostMapping
    public Item createItem(@RequestBody ItemDTO itemDTO) {
        // Find the restaurant by ID
        Restaurant restaurant = restaurantRepository.findById(itemDTO.getRestaurantId())
                .orElseThrow(() -> new RuntimeException("Restaurant not found with id: " + itemDTO.getRestaurantId()));
    
        Item item = new Item(itemDTO.getName(), restaurant);
    
        return itemRepository.save(item);
    }
    
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody ItemDTO updatedItemDTO) {
        Item existingItem = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    
        Restaurant restaurant = restaurantRepository.findById(updatedItemDTO.getRestaurantId())
                .orElseThrow(() -> new RuntimeException("Restaurant not found with id: " + updatedItemDTO.getRestaurantId()));
    
        existingItem.setName(updatedItemDTO.getName());
        existingItem.setRestaurant(restaurant);
    
        return itemRepository.save(existingItem);
    }
    

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemRepository.deleteById(id);
    }
}
