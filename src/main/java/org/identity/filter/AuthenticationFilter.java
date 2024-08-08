package org.identity.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.identity.service.JwtService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class AuthenticationFilter extends OncePerRequestFilter {


    public static final String BEARER = "Bearer";
    public final String AUHORIZATION = "Auhorization";

    private final JwtService jwtService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeaderValue = request.getHeader(AUHORIZATION);
        if (isAuthorizationTokenPresent(authorizationHeaderValue)) {
            String authorizationToken = extractAuthorizationToken(authorizationHeaderValue);
            if (jwtService.validateToken(authorizationToken)) {
                // authenticate here
            }
        }
        filterChain.doFilter(request, response);
    }

    private boolean isAuthorizationTokenPresent(String authorizationHeaderValue) {
        return authorizationHeaderValue != null && authorizationHeaderValue.startsWith(BEARER);
    }

    private String extractAuthorizationToken(String authorizationToken) {
        return  authorizationToken.split(BEARER)[1].stripLeading();
    }
}
