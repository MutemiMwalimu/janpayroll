package com.payroll.emtech.janpayroll.controller;

import com.payroll.emtech.janpayroll.model.Elps;
import com.payroll.emtech.janpayroll.repository.ElpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Elps")

public class ElpsController {

    @Autowired
    public ElpsRepository ELPSRepository;

    @GetMapping
    public List<Elps> getAllElps(){
        return ELPSRepository.findAll();
    }
}

