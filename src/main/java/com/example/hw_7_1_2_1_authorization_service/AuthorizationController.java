
package com.example.hw_7_1_2_1_authorization_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AuthorizationController {
    private AuthorizationService service;
    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@UserAnn User user){
        return service.getAuthorities(user);
    }
}
