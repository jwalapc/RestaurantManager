package com.restaurant.manager.dto;

public class ItemDTO {
    private Long id;
    private String name;
    private Long restaurantId; // Add this field

    // Constructors, getters, setters

    public ItemDTO() {
    }

    public ItemDTO(Long id, String name, Long restaurantId) {
        this.id = id;
        this.name = name;
        this.restaurantId = restaurantId;
    }

    // Other constructors, getters, and setters as needed

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
