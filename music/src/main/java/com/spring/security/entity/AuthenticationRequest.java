package com.spring.security.entity;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class AuthenticationRequest {

    @NotNull
    private String gmail;
    @NotNull
    private String password;
}
