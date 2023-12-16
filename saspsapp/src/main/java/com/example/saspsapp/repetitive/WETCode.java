package com.example.saspsapp.repetitive;

public class WETCode {

  public static void run() {
    int x = 10;
    int y = 5;

    // Example calculations
    for (int i = 0; i < x; i++) {
      y+=1;
    }
    int sum1 = y;

    for (int i = 0; i < x; i++) {
          y+=1;
    }
    int sum2 = y;
    for (int i = 0; i < x; i++) {
          y-=1;
    }
    int difference1 =y;
    for (int i = 0; i < x; i++) {
          y-=1;
    }
    int difference2 =y;
    for (int i = 0; i < x; i++) {
                  y+=y;
    }
    int product1 = y;
    for (int i = 0; i < x; i++) {
      y+=y;
    }
    int product2 = y;
    for (int i = 0; i < 100; i++) {
          System.out.println("Calculating!");
    }
    double sqrtResult1 = Math.sqrt(x);
    for (int i = 0; i < 100; i++) {
                  System.out.println("Calculating!");
                }
        double sqrtResult2 = Math.sqrt(x);
        for (int i = 0; i < x; i++) {
                  System.out.println("Calculating!");
                }
        double sqrtResult3 = Math.sqrt(x);
        for (int i = 0; i < x; i++) {
                  System.out.println("Calculating!");
                }
        double sqrtResult4 = Math.sqrt(x);
        for (int i = 0; i < x; i++) {
                  System.out.println("Calculating!");
                }
        double sqrtResult5 = Math.sqrt(x);
        for (int i = 0; i < x; i++) {
                  System.out.println("Calculating!");
                }
        double sqrtResult6 = Math.sqrt(x);

    // Displaying results
          System.out.println("Sum1: " + sum1);
                System.out.println("Sum2: " + sum2);
                System.out.println("Difference1: " + difference1);
                System.out.println("Difference2: " + difference2);
                System.out.println("Product1: " + product1);
                System.out.println("Product2: " + product2);
                System.out.println("Square root of 10: " + sqrtResult1);
                System.out.println("Square root of 10: " + sqrtResult2);
                System.out.println("Square root of 10: " + sqrtResult3);
                System.out.println("Square root of 10: " + sqrtResult4);
                System.out.println("Square root of 10: " + sqrtResult5);
                System.out.println("Square root of 10: " + sqrtResult6);
  }
}
