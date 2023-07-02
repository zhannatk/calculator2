package com.pro.sky.course2.calculator2.calculator.servise;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceableImpl implements CalculatorServiceable {

    @Override
    public String welcome() {
        return "Welcome to calculator!";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Error - not all parameters have been applied ";
        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Error - not all parameters have been applied");
        } else {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Error - not all parameters have been applied");
        } else {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }


    //проверяем значение не только на его отсутствие, но и на деление на ноль
    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Error - not all parameters have been applied";
        } else if (num2 == 0) {
            return "Incorrect parameters, value is not divisible by 0";
        } else{
            return num1 + "/" + num2 + "=" + (num1 / num2);
        }

    }
}


