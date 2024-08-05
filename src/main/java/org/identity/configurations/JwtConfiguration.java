package org.identity.configurations;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class JwtConfiguration {

    @Value("identity.jwtExpirationInMs")
    private int jwtExpirationMs;

    @Value("identity.jwtSecretKey")
    private String jwtSecretKey;
}
