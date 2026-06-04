package com.java.spring.bean;

public class Order {

    private int id;
    private Customer customer;
    private Product product;

    public Order() {
    }

    public Order(int id, Customer customer, Product product) {
        this.id = id;
        this.customer = customer;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{id=" + id +
                ", customer=" + customer +
                ", product=" + product + "}";
    }
}