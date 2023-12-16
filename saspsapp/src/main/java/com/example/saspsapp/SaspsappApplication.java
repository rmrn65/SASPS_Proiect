package com.example.saspsapp;

import com.example.saspsapp.repetitive.WETCode;
import com.example.saspsapp.run.RunArithmeticOperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaspsappApplication {

  public static void main(String[] args) {
    SpringApplication.run(SaspsappApplication.class, args);
    RunArithmeticOperations runArithmeticOperations = new RunArithmeticOperations();
    runArithmeticOperations.run();
//    WETCode wetCode = new WETCode();
//    wetCode.run();
  }


}
