package org.identity.configurations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("org.identity.entity")
@EnableJpaRepositories("org.identity.repository")
public class JpaConf {
}
