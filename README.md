## CalculatorWithMultithreading

This project demonstrates a simple calculator application built using Spring Boot that performs various calculations concurrently using multithreading.

### Overview

The application includes a RESTful API endpoint `/api/calculator/calculate/{number}` that accepts an integer input and initiates several calculations concurrently:

- Calculate Square
- Calculate Cube
- Check Even/Odd
- Check Prime Number
- Calculate Factorial
- Calculate Reverse of the number
- Check Palindrome Number
- Check Armstrong Number

Each calculation is performed in its own thread to demonstrate multithreading capabilities.

### Technologies Used

- Java
- Spring Boot
- SLF4J for logging

## How to Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/CalculatorWithMultithreading.git


## Usage Examples

### Example 1: Calculating Square and Cube

To calculate the square and cube of a number using the API endpoint:

1. Send a GET request to `/api/calculator/calculate/5` to calculate for the number 5.

2. Check the console or logs for the results of square and cube calculations.
   
## API Endpoint

Once the application is running, you can access the API endpoint using a web browser or tools like Postman:

```bash
http://localhost:8080/api/calculator/calculate/{number}
