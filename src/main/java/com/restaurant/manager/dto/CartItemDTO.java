package com.restaurant.manager.dto;

public class CartItemDTO {
    private Long id;
    private ItemDTO item;
    private int quantity;

    // Constructors, getters, setters

    public CartItemDTO() {
    }

    public CartItemDTO(Long id, ItemDTO item, int quantity) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
    }

    // Other constructors, getters, and setters as needed

    public Long getId() {
        return id;
    }

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
