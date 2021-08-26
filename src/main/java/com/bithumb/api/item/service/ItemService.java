package com.bithumb.api.item.service;

import com.bithumb.api.item.domain.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {

    List<Item> findAll();

    Optional<Item> findById(Long id);

    void save(Item item);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);
}
