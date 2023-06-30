package com.pro.sky.course2.calculator2.calculator.controller;


import com.pro.sky.course2.calculator2.calculator.servise.CalculatorServiceable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceable calculatorServiceable;

    public CalculatorController(CalculatorServiceable calculatorServiceable) {
        this.calculatorServiceable = calculatorServiceable;
    }
    @GetMapping
    public String welcome() {
        return calculatorServiceable.welcome();
    }

    //http://localhost:8080/calculator/plus
    //http://localhost:8080/calculator/plus?num1=10&num2=15
    @GetMapping("/plus")
    public String plus(@RequestParam (required = false) Integer num1,  Integer num2) {
        return calculatorServiceable.plus(num1, num2);
    }
    //http://localhost:8080/calculator/minus
    //http://localhost:8080/calculator/minus?num1=10&num2=15
    @GetMapping("/minus")
    public String minus( Integer num1,  Integer num2) {
        return calculatorServiceable.minus(num1, num2);
    }
    //http://localhost:8080/calculator/multiply
    //http://localhost:8080/calculator/multiply?num1=10&num2=15
    @GetMapping("/multiply")
    public String multiply( Integer num1,  Integer num2) {
        return calculatorServiceable.multiply(num1, num2);
    }
    //http://localhost:8080/calculator/divide
    //http://localhost:8080/calculator/divide?num1=100&num2=15
    //http://localhost:8080/calculator/divide?num1=100&num2=0
    @GetMapping("/divide")
    public String divide( Integer num1,  Integer num2) {
        return calculatorServiceable.divide(num1, num2);
    }
}

