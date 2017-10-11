package edu.bls.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleInputExample {
    
    public static void main(String[] args) throws Exception {
        
        System.out.print("What's your name? ");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String name = reader.readLine();
        
        System.out.println("Hello " + name +"!");
        
    }

}
