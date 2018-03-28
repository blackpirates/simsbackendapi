package com.simsbackend.controllers;

import com.simsbackend.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 28-Mar-18.
 */
@RestController
@RequestMapping("/subjects")
public class SubjectsController {
    @Autowired
    SubjectRepository mysubjects;


}
