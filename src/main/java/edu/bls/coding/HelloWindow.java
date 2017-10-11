package edu.bls.coding;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWindow {
    
    public static void main(String args[]) {
        
        JFrame frame = new JFrame("HelloWorld");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        
        frame.setVisible(true); 
        
    }

}
