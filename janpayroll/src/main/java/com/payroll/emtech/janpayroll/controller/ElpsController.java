package com.payroll.emtech.janpayroll.controller;

import com.payroll.emtech.janpayroll.exception.ResourceNotFoundException;
import com.payroll.emtech.janpayroll.model.Elps;
import com.payroll.emtech.janpayroll.repository.ElpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/elps")
public class ElpsController {

    @Autowired
    private ElpsRepository elpsRepository;

    @GetMapping
    public List<Elps> getAllElps() {
        return elpsRepository.findAll();
    }

    @PostMapping
    public Elps createElps(@RequestBody Elps elps) {
        return elpsRepository.save(elps);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Elps> getElpsById(@PathVariable long id) {
        Elps elps = elpsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Elps not exist with id: " + id));
        return ResponseEntity.ok(elps);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Elps> updateElps(@PathVariable long id, @RequestBody Elps updatedElps) {
        Elps elps = elpsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Elps not exist with id: " + id));


        Elps updatedElpsEntity = elpsRepository.save(elps);
        return ResponseEntity.ok(updatedElpsEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteElpsById(@PathVariable long id) {
        Elps elps = elpsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Elps not exist with id: " + id));

        elpsRepository.delete(elps);
        return ResponseEntity.noContent().build();
    }
}
