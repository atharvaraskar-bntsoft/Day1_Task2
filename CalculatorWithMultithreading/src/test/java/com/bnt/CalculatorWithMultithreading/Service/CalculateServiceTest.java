package com.bnt.CalculatorWithMultithreading.Service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CalculateServiceTest {

    @InjectMocks
    CalculatorService calculatorService;
    
     
    @Test
    void testCalculateSquare() {
        int number = 5;       
        Runnable TaskObj = calculatorService.calculateSquare(number);
        assertDoesNotThrow(() -> TaskObj.run());
    }

    @Test
    void testCalculateCube() {
        int number = 5;       
        Runnable TaskObj = calculatorService.calculateCube(number);
        assertDoesNotThrow(() -> TaskObj.run());
    }

    @Test
    void testCalculateFactorial() {
        int number = 5;       
        Runnable TaskObj = calculatorService.calculateFactorial(number);
        assertDoesNotThrow(() -> TaskObj.run());

    }

    @Test
    void testCalculateAmstrong() {
        int number = 5;       
        Runnable TaskObj = calculatorService.calculateAmstrongOrNot(number);
        assertDoesNotThrow(() -> TaskObj.run());
    }

    

    
    
}
