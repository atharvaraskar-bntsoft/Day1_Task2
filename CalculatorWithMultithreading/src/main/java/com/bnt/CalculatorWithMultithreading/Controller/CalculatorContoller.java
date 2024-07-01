package com.bnt.CalculatorWithMultithreading.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.CalculatorWithMultithreading.Service.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorContoller {
    Logger logger=LoggerFactory.getLogger(CalculatorContoller.class);

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/calculate/{number}")
    public String calculate(@PathVariable("number") int number) {
        new Thread(calculatorService.calculateSquare(number)).start();
        new Thread(calculatorService.calculateCube(number)).start();
        new Thread(calculatorService.calculateEvenOdd(number)).start();
        new Thread(calculatorService.calculatePrimeOrNot(number)).start();
        new Thread(calculatorService.calculateFactorial(number)).start();
        new Thread(calculatorService.calculateReverse(number)).start();
        new Thread(calculatorService.CalculatePalindromeOrNot(number)).start();
        new Thread(calculatorService.calculateAmstrongOrNot(number)).start();
         
        logger.info("All calculatione doen succesfully");
        return "All calculatione doen succesfully";

    }
    
}
