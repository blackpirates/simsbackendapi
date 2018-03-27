package com.simsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SimsbackendapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimsbackendapiApplication.class, args);
	}
}
