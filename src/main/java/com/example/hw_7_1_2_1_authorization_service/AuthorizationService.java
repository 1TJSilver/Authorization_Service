package com.example.hw_7_1_2_1_authorization_service;

import java.util.List;

public class AuthorizationService {
    UserRepository repository;

    public List<Authorities> getAuthorities(User user) {
        if (isEmpty(user.getUser()) || isEmpty(user.getPassword())) {
            throw new InvalidCredentialsException("Login or password is empty");
        }
        List<Authorities> authorities = repository.getAuthorities(user.getUser(), user.getPassword());
        if (isEmpty(authorities)) {
            throw new UnAuthorizedException("User no found");
        }
        return authorities;
    }

    private boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

}
