package com.bithumb.api.order.controller;

import com.bithumb.api.order.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    @GetMapping
    public List<Order> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(Order order) {

    }

    @PutMapping
    public void update(Order order){

    }

    @GetMapping("/exeist/{id}")
    public boolean existsById(long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @DeleteMapping
    public void deleteById(Long id) {

    }
}
