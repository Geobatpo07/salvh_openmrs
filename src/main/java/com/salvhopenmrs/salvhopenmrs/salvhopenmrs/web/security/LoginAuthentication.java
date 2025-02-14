package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Getter
@AllArgsConstructor
public class LoginAuthentication implements Authentication {

    private static final long serialVersionUID = 1L;

    String username;
    String password;
    String token;
    String ipAddress;

    @Override
    public String getName() {
        return LoginAuthentication.class.getSimpleName();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return false;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
    }

}
