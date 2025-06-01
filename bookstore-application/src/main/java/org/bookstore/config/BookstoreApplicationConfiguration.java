package org.bookstore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.bookstore.usecase")
public class BookstoreApplicationConfiguration {
}
