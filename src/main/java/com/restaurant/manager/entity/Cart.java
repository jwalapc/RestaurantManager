package com.restaurant.manager.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items = new ArrayList<>();

    // Constructors, getters, setters

    public Cart() {
    }

    public Cart(Long id) {
        this.id = id;
    }

    public Cart(Cart cart) {
        this.id = cart.id;
        // Copy the cart items (if needed)
        // For simplicity, assuming that CartItem has a copy constructor
        for (CartItem item : cart.items) {
            this.items.add(new CartItem(item));
        }
    }

    public Long getId() {
        return id;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public void addItem(CartItem item) {
        this.items.add(item);
        item.setCart(this);
    }

    public void removeItem(Long itemId) {
        items.removeIf(item -> item.getId().equals(itemId));
    }
}
