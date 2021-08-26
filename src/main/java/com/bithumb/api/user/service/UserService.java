package com.bithumb.api.user.service;

import com.bithumb.api.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    List<User> findAll();

    Optional<User> findById(long id);

    void save(User user);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);
}
