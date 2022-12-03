package com.example.hw_7_1_2_1_authorization_service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    Map<String, String> repository;

    public UserRepository() {
        repository = new ConcurrentHashMap<>();
    }

    public List<Authorities> getAuthorities(String login, String password) {
        List<Authorities> result = new ArrayList<>();
        if (repository.containsKey(login) && repository.get(login).equals(password)) {
            result.add(Authorities.READ);
            result.add(Authorities.DELETE);
            result.add(Authorities.WRITE);
        }
        return result;
    }
}
