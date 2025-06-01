package org.bookstore;

import org.bookstore.config.BookstoreApplicationConfiguration;
import org.bookstore.config.BookstoreDomainConfiguration;
import org.bookstore.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        BookstoreDomainConfiguration.class,
        BookstoreApplicationConfiguration.class,
        WebSecurityConfig.class
})
public class BookstoreApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BookstoreApplication.class).run(args);
    }
}