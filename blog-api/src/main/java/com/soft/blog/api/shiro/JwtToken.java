package com.soft.blog.api.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @description: JwtToken
 * @author: crq
 * @create: 2021-12-07 15:30
 **/
public class JwtToken implements AuthenticationToken {

    private final String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
