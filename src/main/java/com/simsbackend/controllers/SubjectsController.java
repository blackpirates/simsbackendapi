package com.simsbackend.controllers;

import com.simsbackend.exceptions.ResourceNotFoundException;
import com.simsbackend.models.Student;
import com.simsbackend.models.Subject;
import com.simsbackend.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 28-Mar-18.
 */
@RestController
@RequestMapping("/subjects")
public class SubjectsController {
    @Autowired
    SubjectRepository mysubjects;

    // Get  all subjects
    @GetMapping("/all")
    public List<Subject> getAllStudents() {
        return mysubjects.findAll();
    }



    // Create a new student
    @PostMapping("/add")
    public Subject  createStudent(@Valid @RequestBody Subject newSubject) {
        return mysubjects.save(newSubject);
    }


    // Get a Single student by id
    @GetMapping("/search/{id}")
    public Subject getStudentById(@PathVariable(value = "id") int  id) {
        return mysubjects.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Subject", "id", id));
    }
}
