package com.example.httprestclient.controller;

import com.example.httprestclient.client.UserRestClient;
import com.example.httprestclient.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public final class RestController {

    private final UserRestClient userRestClient;

    @GetMapping("/rest")
    public List<User> findAlUsers(){
        return userRestClient.findAll();
    }

    @GetMapping("/rest/{id}")
    public User findAlUsersById(@PathVariable Integer id){
        return userRestClient.findById(id);
    }


}

