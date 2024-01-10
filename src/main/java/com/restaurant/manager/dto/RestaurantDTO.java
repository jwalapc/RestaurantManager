package com.restaurant.manager.dto;

public class RestaurantDTO {
    private Long id;
    private String name;

    // Constructors, getters, setters

    public RestaurantDTO() {
    }

    public RestaurantDTO(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
