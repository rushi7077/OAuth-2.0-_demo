package com.example.OAuthDemo.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {



    @GetMapping("/private")
    public String privateApi(OAuth2AuthenticationToken token){
        return "Private API" + token.getPrincipal().getAttribute("email");
    }

}
