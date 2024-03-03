package com.example.httprestclient;

import com.example.httprestclient.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserHttpRestClient {
    @GetExchange("/users")
    List<User> findAll();

    @GetExchange("/users/{id}")
    User findById(@PathVariable Integer id);
}
