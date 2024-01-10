package com.restaurant.manager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Constructors, getters, setters

    public Cart() {
    }

    public Cart(Long id) {
        this.id = id;
    }

    public Cart(Cart cart) {
        this.id = cart.id;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id){
        this.id = id;
    }


}
