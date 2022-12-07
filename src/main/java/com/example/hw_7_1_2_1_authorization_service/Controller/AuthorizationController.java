
package com.example.hw_7_1_2_1_authorization_service.Controller;

import com.example.hw_7_1_2_1_authorization_service.Authorities;
import com.example.hw_7_1_2_1_authorization_service.Service.AuthorizationService;
import com.example.hw_7_1_2_1_authorization_service.UserInfo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    private AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(User user) {
        return service.getAuthorities(user);
    }
}
