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

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
@EnableJpaAuditing
public class SimsbackendapiApplication implements CommandLineRunner {
@Autowired
	ClassesRepository mylevels;
	@Autowired
	StudentsRepository mystudents;

	public static void main(String[] args) {
		SpringApplication.run(SimsbackendapiApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
mystudents.deleteAllInBatch();

mylevels.deleteAllInBatch();
		Student mystudent= new Student("KOMBO STEVE","2000", LocalDate.of(2000,07,30),new Date("17/07/2018"),1);

		Classes myclass=new Classes("FORM ONE","YELLOW");
		Classes myclass2=new Classes("FORM TWO","ORANGE");

		mystudent.getClasses().add(myclass);
		mystudent.getClasses().add(myclass2);

		myclass.getStudents().add(mystudent);
		myclass2.getStudents().add(mystudent);

		mystudents.save(mystudent);

	}
}
