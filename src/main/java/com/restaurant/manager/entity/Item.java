package com.restaurant.manager.entity;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Establishing a Many-to-One relationship with Restaurant
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    // Constructors, getters, setters

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, Restaurant restaurant) {
        this.name = name;
        this.restaurant = restaurant;
    }

    public Item(Long id, String name, Restaurant restaurant) {
        this.id = id;
        this.name = name;
        this.restaurant = restaurant;
    }

    public Item(Item item) {
        this.id = item.id;
        this.name = item.name;
        this.restaurant = item.restaurant;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
