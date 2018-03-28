package com.simsbackend.controllers;

import com.simsbackend.exceptions.ResourceNotFoundException;
import com.simsbackend.models.Exams;
import com.simsbackend.repositories.ExamsRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 28-Mar-18.
 */


@RestController
@RequestMapping("/exams")

public class ExamsController {

ExamsRepository myexamsrepository;

    // Get All guardians
    @GetMapping("/all")
    public List<Exams> getAllExams() {
        return myexamsrepository.findAll();
    }



    // Create a new exam
    @PostMapping("/add")
    public Exams  createExam(@Valid @RequestBody Exams newexam) {
        return myexamsrepository.save(newexam);
    }


    // Get a single parent by id
    @GetMapping("/search/{id}")
    public Exams search(@PathVariable(value = "id") int  id) {
        return myexamsrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exams", "id", id));
    }
}
