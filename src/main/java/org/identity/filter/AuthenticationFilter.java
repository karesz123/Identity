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
        String authorizationToken = request.getHeader(AUHORIZATION);
        if (authorizationToken != null && authorizationToken.startsWith(BEARER)) {
            authorizationToken = authorizationToken.split(BEARER)[1].stripLeading();
        }
        filterChain.doFilter(request, response);

    }
}
