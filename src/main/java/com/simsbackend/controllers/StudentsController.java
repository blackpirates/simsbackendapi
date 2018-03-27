package com.simsbackend.controllers;

import com.simsbackend.exceptions.ResourceNotFoundException;
import com.simsbackend.models.Classes;
import com.simsbackend.models.Student;
import com.simsbackend.repositories.ClassesRepository;
import com.simsbackend.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 26-Mar-18.
 */
@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    StudentsRepository mystudents;


    // Get All students
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return mystudents.findAll();
    }



    // Create a new student
    @PostMapping("/add")
    public Student  createStudent(@Valid @RequestBody Student newstudent) {
        return mystudents.save(newstudent);
    }


    // Get a Single student by id
    @GetMapping("/search/{id}")
    public Student getStudentById(@PathVariable(value = "id") int  id) {
        return mystudents.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
    }
}
