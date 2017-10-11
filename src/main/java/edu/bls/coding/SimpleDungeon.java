package edu.bls.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleDungeon {
    
    public static void main(String[] args) throws Exception {
        
        System.out.print("You are in a terrible scary dungeon.  A red and blue potion sit on a table.  Which one do you drink? \n> ");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String choice = reader.readLine();
        
        switch (choice.toLowerCase()) {
            case "red":
                System.out.println("You are destroyed by your folly.");
                break;
            case "blue":
                System.out.println("You turn into a majestic dragon, to be feared and admired by all.");
                break;
            default:
                System.out.println("You've wasted your turn with jokes or indecision.");
        }
        
        
    }

}
