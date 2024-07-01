package com.bnt.CalculatorWithMultithreading.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bnt.CalculatorWithMultithreading.Exception.InputValidationException;

@Service
public class CalculatorService  {
    Logger logger=LoggerFactory.getLogger(CalculatorService.class);

    public Runnable calculateSquare(int n){
        if (n < 0) {
            throw new InputValidationException("Number must be non-negative for square calculation.");
        }
        return ()->{
            int square=n*n;
            logger.info("Square of {} is {}", n, square);
         };
    }

    public Runnable calculateCube(int n){
        if (n < 0) {
            throw new InputValidationException("Number must be non-negative for cube calculation.");
        }
        return ()->{
            int cube=n*n*n;
            logger.info("Cube of {} is {}", n, cube);
         };
    }

    public Runnable calculateEvenOdd(int n){
        return ()->{
            if (n % 2 == 0) {
                logger.info("{} is even", n);
            } else {
                logger.info("{} is odd", n);
            }
         };
    }

    public Runnable calculatePrimeOrNot(int n){
        return ()->{
            int flag=0;
            if(n==0||n==1){  
                System.out.println(n+" is not prime number");      
           }else{  
                for(int i=2;i<n;i++){      
                    if (n % i == 0) {
                        logger.info("{} is not prime number", n);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    logger.info("{} is prime number", n);
                }     
                }      
         };
    }


    public Runnable calculateFactorial(int n){
        if (n < 0) {
            throw new InputValidationException("Number must be non-negative for factorial calculation.");
        }
        return ()->{
            int i,fact=1;     
            for(i=1;i<=n;i++){    
                  fact=fact*i;
            }    
            System.out.println("Factorial of "+n+" is: "+fact);    
 
         };
    }

    public Runnable calculateReverse(int n){
        return ()->{
            int number=n;
            int reverse=0;
               while(number>0){
                int rem=number%10;
                reverse=(reverse*10)+rem;
                number=number/10;
               }  
               logger.info("Reverse of {} is: {}", n, reverse);   
 
         };
    }

    public Runnable CalculatePalindromeOrNot(int n){
        return ()->{
            int number=n;
            int reverse=0;
               while(number>0){
                int rem=number%10;
                reverse=(reverse*10)+rem;
                number=number/10;
               }  
             if (reverse == n) {
                logger.info("{} is a palindrome number", n);
            } else {
                logger.info("{} is not a palindrome number", n);
            }  
 
         };
        }

         public Runnable calculateAmstrongOrNot(int n){
            if (n < 0) {
                throw new InputValidationException("Number must be non-negative for Armstrong number check.");
            }
            return ()->{
                int temp, count=0, last=0, sum=0;     
                temp=n;     
                while(temp>0)    
                {   
                temp = temp/10;   
                count++;   
                }   

                temp = n;   
                while(temp>0){        
                     last = temp % 10;   
                     sum +=  (Math.pow(last, count));   
                      temp = temp/10;   
                }  

                if (n == sum) {
                    logger.info("{} is an Armstrong number", n);
                } else {
                    logger.info("{} is not an Armstrong number", n);
                }  
                 
             };
        

    

    } 
    
} 