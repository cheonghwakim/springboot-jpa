package com.bithumb.api.user.service;

import com.bithumb.api.user.domain.User;
import com.bithumb.api.user.repository.UserRepository;
import com.bithumb.api.util.Proxy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl extends Proxy implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {

        int res = intMax.apply(5, 7);
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
