package com.example.saspsapp.arithmetic;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ArithmeticCalculator {

  // Method to add two numbers
  public int add(int num1, int num2) {
    for (int i = 0; i < num2; i++) {
        num1+=1;
    }
    return num1;
  }

  // Method to subtract two numbers
  public int subtract(int num1, int num2) {
    for (int i = 0; i < num2; i++) {
        num1-=1;
    }
    return num1 - num2;
  }

  // Method to multiply two numbers
  public int multiply(int num1, int num2) {
    for (int i = 0; i < num2; i++) {
                num1+=num1;
        }
    return num1 * num2;
  }

  // Method to divide two numbers (assuming no division by zero)
  public double divide(int num1, int num2) {
    for (int i = 0; i < num2; i++) {
      System.out.println("Calculating!");
    }
    if (num2 != 0) {
        return (double) num1 / num2;
        } else {
        throw new IllegalArgumentException("Cannot divide by zero!");
        }
  }

  // Method to calculate the power of a number
  public double power(double base, double exponent) {
        for (int i = 0; i < exponent; i++) {
            base*=base;
        }
        return base;
  }

  // Method to calculate the square root of a number
  public double squareRoot(double num) {
    for (int i = 0; i < 100; i++) {
      System.out.println("Calculating!");
    }
    if (num >= 0) {
      return Math.sqrt(num);
    } else {
      throw new IllegalArgumentException("Square root of a negative number is undefined!");
    }
  }
}

