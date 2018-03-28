package com.simsbackend.controllers;

import com.simsbackend.exceptions.ResourceNotFoundException;
import com.simsbackend.models.Guardians;
import com.simsbackend.models.Staff;
import com.simsbackend.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 28-Mar-18.
 */
@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffRepository mystaff;

    // Get all staff
    @GetMapping("/all")
    public List<Staff> getAllParents() {
        return mystaff.findAll();
    }



    // Create a new parent
    @PostMapping("/add")
    public Staff  createParent(@Valid @RequestBody Staff newstaff) {
        return mystaff.save(newstaff);
    }


    // Get a single parent by id
    @GetMapping("/search/{id}")
    public Staff getParentById(@PathVariable(value = "id") int  id) {
        return mystaff.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Staff", "id", id));
    }

}
