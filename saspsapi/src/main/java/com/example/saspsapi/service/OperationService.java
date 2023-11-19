package com.example.saspsapi.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationService {

  // Method to add two numbers
  public int add(List<Integer> numbers) {
    return numbers.stream().reduce(0, Integer::sum);
  }

  // Method to subtract two numbers
  public int subtract(List<Integer> numbers) {
    int n1 = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      n1 -= numbers.get(i);
    }
    return n1;
  }

  // Method to multiply two numbers
  public int multiply(List<Integer> numbers) {
    return numbers.stream().reduce(1, (a, b) -> a * b);
  }

  // Method to divide two numbers (assuming no division by zero)
  public double divide(List<Integer> numbers) {
    int n1 = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      if (numbers.get(i) == 0) {
        throw new IllegalArgumentException("Cannot divide by zero!");
      }
      n1 /= numbers.get(i);
    }
    return n1;
  }

  // Method to calculate the power of a number
  public double power(double base, double exponent) {
    return Math.pow(base, exponent);
  }

  // Method to calculate the square root of a number
  public double squareRoot(double num) {
    if (num >= 0) {
      return Math.sqrt(num);
    } else {
      throw new IllegalArgumentException("Square root of a negative number is undefined!");
    }
  }
}
