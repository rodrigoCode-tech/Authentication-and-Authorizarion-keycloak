package com.auth.app_auth_keycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping(value = "/")
    @PreAuthorize("hasRole('USER')")
    public String list() {
        return "Listando produtos";
    }

    @PostMapping(value = "/")
    @PreAuthorize("hasRole('ADMIN')")
    public String create() {
        return "Cadastrando produtos";
    }

}
