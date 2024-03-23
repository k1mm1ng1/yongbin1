package com.dion.todo.globar.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtProperties {

    private String secretKey;
    private String header;
    private String prefix;
    private Long accessExp;
    private Long refreshExp;

}
