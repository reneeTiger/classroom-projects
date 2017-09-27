package edu.bls.coding;

/**
 * This program will calculate an average.
 * 
 * @author jeffreydpayne
 *
 */

public class AverageCalculator {
    
    public static void main(String[] args) throws Exception {
        
        int[] numbers = {1,9,34,5,7,89,32,7,8};
        
        AverageCalculator calc = new AverageCalculator();
        
        float avg = calc.computeAverage(numbers);
        
        System.out.println("Average: " + avg);
        
        
    }
    
    
    public Float computeAverage(int[] numbers) {
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        float avg = ((float) sum) / numbers.length;
        
        return avg;
        
    }

}
