package org.identity.service;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.identity.configurations.JwtConfig;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@RequiredArgsConstructor
@Service
public class JwtService {

    private final JwtConfig jwtConfig;

    public String generateToken() {
        Date issuedAt = new Date(System.currentTimeMillis());
        return Jwts.builder()
                .subject("userName")
                .issuedAt(issuedAt)
                .expiration(calculateExpirationDate(issuedAt))
                .signWith(generateSigningKey(), Jwts.SIG.HS256)
                .compact();
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parser()
                    .verifyWith(generateSigningKey())
                    .build()
                    .parseSignedClaims(authToken);
            return true;
        } catch (JwtException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    private SecretKey generateSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(jwtConfig.getJwtSecretKey());
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private Date calculateExpirationDate(Date issuedDate) {
        return new Date(issuedDate.getTime() + jwtConfig.getJwtExpirationMs());
    }
}

