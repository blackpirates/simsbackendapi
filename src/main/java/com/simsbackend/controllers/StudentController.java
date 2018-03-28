package com.simsbackend.controllers;

import com.simsbackend.models.Staff;
import com.simsbackend.models.StudentClasses;
import com.simsbackend.repositories.StudentClassesRepository;
import com.simsbackend.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 28-Mar-18.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentClassesRepository student ;

    @GetMapping("/all")
    public List<StudentClasses> getAllParents() {
        return student.findAll();
    }
}
