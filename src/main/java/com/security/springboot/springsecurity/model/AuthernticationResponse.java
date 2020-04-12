package com.security.springboot.springsecurity.model;

public class AuthernticationResponse {

    private final String jwt;

    public AuthernticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
