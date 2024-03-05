package com.example.httprestclient.client;

import com.example.httprestclient.model.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class UserWebClient {

    private final WebClient webClient;

    public UserWebClient() {
        this.webClient = WebClient.create("https://jsonplaceholder.typicode.com/users");
    }

    public Mono<List<User>> findAll() {


        return webClient.get()
                .retrieve()
                .bodyToFlux(User.class).collectList();

    }

    public Mono<User> findById(Integer id) {

        return webClient.get()
                .uri("/"+id)
                .retrieve()
                .bodyToMono(User.class);
    }
}
