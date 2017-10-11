package edu.bls.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SquareRootCalculator {
    
    public static void main(String[] args) throws Exception {
        
        System.out.print("Enter a number: ");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        double num = Double.parseDouble(reader.readLine());
        double squareRoot = Math.sqrt(num);
        
        System.out.println("The square root of " + num + " is " + squareRoot);
        
        
    }

}
