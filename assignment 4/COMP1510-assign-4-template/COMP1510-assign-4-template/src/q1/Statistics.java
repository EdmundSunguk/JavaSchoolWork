package q1;

import java.util.Scanner;
import java.text.DecimalFormat;

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
    private static double sumInput;
    
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
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        DecimalFormat fmt = new DecimalFormat("0.##");

        System.out.println("Statistics");
        System.out.println("The program will round the mean and "
                + "standard deviation into two decimal places.");
        System.out.println("Enter the numbers you want to compute"
                + " with spaces between:");
        String numString = scan.nextLine();
        
        String[] arrayString = numString.split(" ");
        int[] input = new int[arrayString.length];
        
        //Reading numbers from user
        for (int i = 0; i < arrayString.length; i++) {
            input[i] = Integer.parseInt(arrayString[i]);
        }
        
        //calculating mean
        for (int i = 0; i < input.length; i++) {
            sumInput += input[i];
        }
        average = sumInput / input.length;
        
        //calculating standard deviation
        for (int i = 0; i < input.length; i++) {
            standDevNumerator += Math.pow(input[i] - average, 2);
        }
        standDeviation = Math.sqrt(standDevNumerator 
                / (double) (input.length - 1));
        
        System.out.println("This is the mean: " + fmt.format(average));
        System.out.println("This is the standard deviation: "
                + fmt.format(standDeviation));
        
        
    }

};
