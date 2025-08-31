package com.office.swedish.leads;

import com.office.swedish.clients.annotations.EnableSOClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSOClients
@SpringBootApplication
public class ServiceApplication {
    public static void main(final String[] args) {
        SpringApplication.run(ServiceApplication.class);
    }
}