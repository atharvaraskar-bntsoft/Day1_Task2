package com.bnt.CalculatorWithMultithreading.Controller;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.bnt.CalculatorWithMultithreading.Service.CalculatorService;



@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CalculateControllerTest {

    @Mock 
    CalculatorService calculatorService;

    @InjectMocks
    CalculatorContoller calculatorContoller;
    
    
    @Test
    public void calculateTest(){
        int number = 10;
        String result = calculatorContoller.calculate(number);

        verify(calculatorService).calculateSquare(number);
        verify(calculatorService).calculateCube(number);
        verify(calculatorService).calculateEvenOdd(number);
        verify(calculatorService).calculatePrimeOrNot(number);
        verify(calculatorService).calculateFactorial(number);
        verify(calculatorService).calculateReverse(number);
        verify(calculatorService).CalculatePalindromeOrNot(number);
        verify(calculatorService).calculateAmstrongOrNot(number);
    }
}
