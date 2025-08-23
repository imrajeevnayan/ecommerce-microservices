package com.ecom.order_service.controller;

import com.ecom.order_service.client.UserClient;
import com.ecom.order_service.dto.UserDTO;
import com.ecom.order_service.model.Order;
import com.ecom.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserClient userClient;

    @GetMapping
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order){
        Order saved =orderRepository.save(order);
        return ResponseEntity.ok(saved);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getOrdersWithUser(@PathVariable Long userId) {
        List<Order> orders = orderRepository.findByUserId(userId);
        if (orders.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        UserDTO user = userClient.getUser(userId);
        Map<String, Object> response = new HashMap<>();
        response.put("user", user);
        response.put("orders", orders);

        return ResponseEntity.ok(response);
    }
}
