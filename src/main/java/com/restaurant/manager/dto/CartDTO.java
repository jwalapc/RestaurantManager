package com.restaurant.manager.dto;

import java.util.List;

public class CartDTO {
    private Long id;
    private List<CartItemDTO> items;

    // Constructors, getters, setters

    public CartDTO() {
    }

    public CartDTO(Long id, List<CartItemDTO> items) {
        this.id = id;
        this.items = items;
    }

    // Other constructors, getters, and setters as needed

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CartItemDTO> getItems() {
        return items;
    }

    public void setItems(List<CartItemDTO> items) {
        this.items = items;
    }
}
