package org.identity.configurations;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class JwtConfig {

    @Value("identity.jwtExpirationInMs")
    private int jwtExpirationMs;

    @Value("identity.jwtSecretKey")
    private String jwtSecretKey;
}
