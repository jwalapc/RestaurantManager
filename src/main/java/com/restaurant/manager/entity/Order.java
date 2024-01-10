package com.restaurant.manager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Constructors, getters, setters

    public Order() {
    }

    public Order(Long id) {
        this.id = id;
    }

    public Order(Order order) {
        this.id = order.id;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id){
        this.id = id;
    }

    





}
