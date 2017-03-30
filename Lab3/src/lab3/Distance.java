package lab3;

// ************************************************************************
//  Distance.java
//
//  Computes teh distance between two points
// ************************************************************************

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        double x1, y1, x2, y2; // coordinates of two points
        double distance;       // distance between the points
        
        Scanner scan = new Scanner(System.in);
        
        // Read in the two points
        System.out.println("Enter the coordinates of the first points " +
                           "(put a space between them) : ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        // Compute the distance
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        
        // Print out the answer
        System.out.println("This is the distance between two coordinates: " +
                           distance);
    }
}
