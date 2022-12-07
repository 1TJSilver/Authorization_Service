
package com.example.hw_7_1_2_1_authorization_service.Service;

import com.example.hw_7_1_2_1_authorization_service.Authorities;
import com.example.hw_7_1_2_1_authorization_service.Exceptions.InvalidCredentialsException;
import com.example.hw_7_1_2_1_authorization_service.Exceptions.UnAuthorizedException;
import com.example.hw_7_1_2_1_authorization_service.Repository.UserRepository;
import com.example.hw_7_1_2_1_authorization_service.UserInfo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService {
    UserRepository repository;

    public AuthorizationService(UserRepository repository) {
        this.repository = repository;
    }

    public List<Authorities> getAuthorities(User user) {
        if (isEmpty(user.getUser()) || isEmpty(user.getPassword())) {
            throw new InvalidCredentialsException("Login or password is empty");
        }
        List<Authorities> authorities = repository.getAuthorities(user.getUser(), user.getPassword());
        if (isEmpty(authorities)) {
            throw new UnAuthorizedException(  "User not found");
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

