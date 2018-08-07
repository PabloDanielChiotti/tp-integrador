package com.kaitzen;

import com.kaitzen.model.Customer;
import com.kaitzen.repository.CustomerRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.stream.Stream;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kaitzen"})
@EnableJpaAuditing
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    ApplicationRunner run(CustomerRepository customerRepository) {

        return args ->
                Stream.of("Lucas", "Juan", "Pablo", "Jose").forEach(
                        name -> customerRepository.save(new Customer(name)));
    }
}
