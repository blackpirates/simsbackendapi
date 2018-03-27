package com.simsbackend.controllers;

import com.simsbackend.models.Classes;
import com.simsbackend.repositories.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 26-Mar-18.
 */
@RestController
@RequestMapping("/classes")
public class ClassesController {
    @Autowired
    ClassesRepository levels;


    // Get All classes
    @GetMapping("/all")
    public List<Classes> getAllClasses() {
        return levels.findAll();
    }



    // Create a new Note
    @PostMapping("/new")
    public Classes createClass(@Valid @RequestBody Classes newclass) {
        return levels.save(newclass);
    }
}
