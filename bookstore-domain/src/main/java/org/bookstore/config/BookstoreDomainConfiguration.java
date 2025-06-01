package org.bookstore.config;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("org.bookstore.domain")
@EnableJpaRepositories("org.bookstore.repository")
public class BookstoreDomainConfiguration {
}
