package com.simsbackend.controllers;

import com.simsbackend.exceptions.ResourceNotFoundException;
import com.simsbackend.models.Departments;
import com.simsbackend.models.Exams;
import com.simsbackend.repositories.DepartmentsRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 29-Mar-18.
 */
@RestController
@RequestMapping("/departments")
public class DepartmentsController  {
DepartmentsRepository mydepartments;
    // Get All guardians
    @GetMapping("/all")
    public List<Departments> getAllExams() {
        return mydepartments.findAll();
    }



    // Create a new exam
    @PostMapping("/add")
    public Departments  createExam(@Valid @RequestBody Departments newdepartment) {
        return mydepartments.save(newdepartment);
    }


    // Get a single parent by id
    @GetMapping("/search/{id}")
    public Departments search(@PathVariable(value = "id") int  id) {
        return mydepartments.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Departments", "id", id));
    }


}
