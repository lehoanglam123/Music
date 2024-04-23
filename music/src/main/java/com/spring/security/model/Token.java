package com.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Token {
    public Long id;
    public String token;
    public TokenType tokeType;

    public boolean revoked;

    public boolean expired;

    public Integer accountId;

}
