package com.example.httprestclient.controller;

import com.example.httprestclient.UserHttpRestClient;
import com.example.httprestclient.client.UserRestClient;
import com.example.httprestclient.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
@RequestMapping("httprest")
public final class HttpRestController {

    private final UserHttpRestClient userHttpRestClient;

    @GetMapping()
    public List<User> findAlUsers(){
        System.out.println("UserHttpRestClient");
        return userHttpRestClient.findAll();
    }

    @GetMapping("/{id}")
    public User findAlUsersById(@PathVariable
                                Integer id){
        System.out.println("ById = "+ id );
        return userHttpRestClient.findById( id);
    }


}

