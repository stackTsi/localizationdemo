package com.example.demo.controller;

import com.example.demo.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;


    @GetMapping("/add")
    public ResponseEntity<Double> add(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(calculatorService.add(a, b));
    }

    @GetMapping("/subtract")
    public ResponseEntity<Double> subtract(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(calculatorService.subtract(a, b));
    }
    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return calculatorService.divide(a, b);
    }
}
