package com.example.saspsapp.run;

import com.example.saspslib.arithmetic.ArithmeticCalculator;


import lombok.NoArgsConstructor;
@NoArgsConstructor
public class RunArithmeticOperations {


  public static void run() {

    ArithmeticCalculator calculator = new ArithmeticCalculator();

    // Example calculations
    int sum = calculator.add(5, 3);
    int difference = calculator.subtract(10, 4);
    int product = calculator.multiply(6, 7);
    double quotient = calculator.divide(20, 4);
    double result = calculator.power(2, 3);
    double sqrtResult = calculator.squareRoot(25);

    // Displaying results
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Result of 2 to the power of 3: " + result);
    System.out.println("Square root of 25: " + sqrtResult);
  }

}
