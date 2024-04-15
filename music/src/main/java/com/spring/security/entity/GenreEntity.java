package com.spring.security.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
@Builder
public class GenreEntity {
    @NotNull
    private String genreName;

    @JsonCreator
    private GenreEntity(@JsonProperty("genreName") String name) {
        this.genreName = name;
    }
}
