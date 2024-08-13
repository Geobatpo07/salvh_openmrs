package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.exception.ForbiddenException;
import com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.vo.ApiResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationErrorHandler implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {

        String message = authException.getLocalizedMessage();
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        ApiResponse apiResponse = ApiResponse.error(new ForbiddenException(message));
        new ObjectMapper().writeValue(response.getWriter(), apiResponse);
    }
}
