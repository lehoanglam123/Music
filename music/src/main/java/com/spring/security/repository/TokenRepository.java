package com.spring.security.repository;


import com.spring.security.model.Token;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface TokenRepository {
    Optional<Token> getTokenByToken(String token);
}
