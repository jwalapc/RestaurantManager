package com.restaurant.manager.service;

import com.restaurant.manager.dto.ItemDTO;
import com.restaurant.manager.entity.Item;
import com.restaurant.manager.entity.Restaurant;
import com.restaurant.manager.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.restaurant.manager.repository.RestaurantRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

@Autowired
private RestaurantRepository restaurantRepository;

public Item createItem(ItemDTO itemDTO) {
    Item item = new Item(itemDTO.getName());

    if (itemDTO.getRestaurantId() != null) {
        Restaurant restaurant = restaurantRepository.findById(itemDTO.getRestaurantId())
                .orElseThrow(() -> new RuntimeException("Restaurant not found with id: " + itemDTO.getRestaurantId()));
        item.setRestaurant(restaurant);
    }

    return itemRepository.save(item);
}


    public Item updateItem(Long id, ItemDTO updatedItemDTO) {
        Item existingItem = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));

        existingItem.setName(updatedItemDTO.getName());

        return itemRepository.save(existingItem);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
