package com.sj.spring.jpa.springJPA.controller;

import com.sj.spring.jpa.springJPA.model.UserMaster;
import com.sj.spring.jpa.springJPA.repository.StudentRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StudentRegistrationController {
    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;

    @PostMapping("/studentRegistration")
    public UserMaster createStudentRegistration(@Valid @RequestBody UserMaster studentRegistration) {
    	System.out.println("HI");
        return studentRegistrationRepository.save(studentRegistration);
    }
}
