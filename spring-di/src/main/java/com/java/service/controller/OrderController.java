package com.java.spring.controller;

import com.java.service.OrderService;
import com.java.spring.bean.Order;

public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order save(Order order) {
        System.out.println("Order Controller");
        orderService.save(order);
        return order;
    }
}