package org.identity.jwt;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.identity.configurations.JwtConfiguration;

import javax.crypto.SecretKey;
import java.util.Date;

@RequiredArgsConstructor
public class JwtUtil {

    private final JwtConfiguration jwtConfiguration;

    public String generateToken() {
        Date issuedAt = new Date(System.currentTimeMillis());
        return Jwts.builder()
                .subject("userName")
                .issuedAt(issuedAt)
                .expiration(calculateExpirationDate(issuedAt))
                .signWith(generateSigningKey(), Jwts.SIG.HS256)
                .compact();
    }

    private SecretKey generateSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(jwtConfiguration.getJwtSecretKey());
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private Date calculateExpirationDate(Date issuedDate) {
        return new Date(issuedDate.getTime() + jwtConfiguration.getJwtExpirationMs());
    }

    public boolean validateToken(String authtoken) {
        try {
            Jwts.parser()
                    .verifyWith(generateSigningKey())
                    .build()
                    .parseSignedClaims(authtoken);
            return true;
        } catch (JwtException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}

