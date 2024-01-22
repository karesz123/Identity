package org.identity.configurations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.identity.entities")
@EnableJpaRepositories(basePackages = "org.identity.repositories")
public class JpaConf {
}
