package com.example.httprestclient.controller;

import com.example.httprestclient.UserHttpRestClient;
import com.example.httprestclient.client.UserWebClient;
import com.example.httprestclient.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
@RequestMapping("/webrest")
public final class WebHttpRestController {

    private final UserWebClient userWebClient;

    @GetMapping()
    public Mono<List<User>> findAlUsers(){
        System.out.println("UserWebClient");
        return userWebClient.findAll();
    }

    @GetMapping("/{id}")
    public Mono<User> findAlUsersById(@PathVariable
                                Integer id){
        System.out.println("ById = "+ id );
        return userWebClient.findById( id);
    }


}

