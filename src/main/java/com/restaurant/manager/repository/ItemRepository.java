package com.restaurant.manager.repository;

import com.restaurant.manager.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
