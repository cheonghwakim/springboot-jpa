package com.bithumb.api.item.controller;

import com.bithumb.api.item.domain.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {
    @GetMapping
    public List<Item> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Item> findById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(Item item) {

    }

    @PutMapping
    public void update(Item item){

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
