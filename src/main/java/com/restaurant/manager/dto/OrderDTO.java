package com.restaurant.manager.dto;

import java.util.List;

public class OrderDTO {
    private Long id;
    private List<OrderItemDTO> items;
    private String customerName;
    private double totalAmount;

    // Constructors, getters, setters

    public OrderDTO() {
    }

    public OrderDTO(Long id, List<OrderItemDTO> items, String customerName, double totalAmount) {
        this.id = id;
        this.items = items;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Other constructors, getters, and setters as needed

    public Long getId() {
        return id;
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDTO> items) {
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
