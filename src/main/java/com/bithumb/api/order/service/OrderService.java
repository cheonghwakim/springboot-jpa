package com.bithumb.api.order.service;

import com.bithumb.api.order.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface OrderService {
    List<Order> findAll();

    Optional<Order> findById(Long id);

    void save(Order order);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);
}
