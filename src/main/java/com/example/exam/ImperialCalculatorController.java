package com.example.exam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ImperialCalculatorController {

    ImperialCalculator a=new ImperialCalculator();
    @RequestMapping("/centimeter")//localhost:8080/centimeter?in=10
    public double centimeter(int in){
        return a.centimeter (in);
    } }
