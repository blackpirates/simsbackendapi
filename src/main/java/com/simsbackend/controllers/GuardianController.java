package com.simsbackend.controllers;

import com.simsbackend.exceptions.ResourceNotFoundException;
import com.simsbackend.models.Guardians;
import com.simsbackend.repositories.GuardiansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 28-Mar-18.
 */

@RestController
@RequestMapping("/parents")
public class GuardianController {
    @Autowired
    GuardiansRepository myparents;

    // Get All guardians
    @GetMapping("/all")
    public List<Guardians> getAllParents() {
        return myparents.findAll();
    }



    // Create a new parent
    @PostMapping("/add")
    public Guardians  createParent(@Valid @RequestBody Guardians newparent) {
        return myparents.save(newparent);
    }


    // Get a single parent by id
    @GetMapping("/search/{id}")
    public Guardians getParentById(@PathVariable(value = "id") int  id) {
        return myparents.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Guardians", "id", id));
    }
}
