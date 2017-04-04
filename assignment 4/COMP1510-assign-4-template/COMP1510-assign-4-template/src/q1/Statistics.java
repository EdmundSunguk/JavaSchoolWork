package q1;

import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Statistics {
    
    /**
     * <p></p>
     */
    static Scanner scan = new Scanner(System.in);
    
    /**
     * <p></p>
     */
    private final static int MAXINPUT = 50;
    
    /**
     * <p></p>
     */
    private static int[] input = new int[MAXINPUT];
    
    /**
     * <p></p>
     */
    private static int sumInput;
    
    /**
     * <p></p>
     */
    private static double average;
    
    /**
     * <p></p>
     */
    private static double standDevNumerator;
    
    /**
     * <p></p>
     */
    private static double standDeviation;
    
    
    private static int[] inputArray(int ... list) {
        
        if (list.length != 0 && list.length <= 50) {
            int[] localArray = new int[list.length];
            
        }
        return list;
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        System.out.println("Statistics");
        System.out.println("Enter the numbers you want to compute"
                + " with spaces between:");
        //Reading numbers from user
        for (int i = 0; i < MAXINPUT; i++) {
            input[i] = scan.nextInt();
            if (input[i] == 0) {
                break;
            }
        }
        
        //calculating mean
        for (int i = 0; i < input.length; i++) {
            sumInput += input[i];
        }
        average = sumInput / input.length - 1;
        
        //calculating standard deviation
        for (int i = 0; i < input.length; i++) {
            standDevNumerator += Math.pow(input[i] - average, 2);
        }
        standDeviation = Math.sqrt(standDevNumerator 
                / input.length - 1);
        
        System.out.println("This is the mean: " + average);
        System.out.println("This is the standard deviation: "
                + standDeviation);
        
        
    }

};
