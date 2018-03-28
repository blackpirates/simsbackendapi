package com.simsbackend;

import com.simsbackend.models.Classes;
import com.simsbackend.models.Student;
import com.simsbackend.repositories.ClassesRepository;
import com.simsbackend.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
@EnableJpaAuditing
public class SimsbackendapiApplication  {


	public static void main(String[] args) {
		SpringApplication.run(SimsbackendapiApplication.class, args);
	}


}
