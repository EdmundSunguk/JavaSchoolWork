package q3;

import java.util.Scanner;

/**
 * <p>This is the class that has main method and using Student object.
 * Also, it reads two students' information at the same time, one with name and
 * 3 test scores and the other with test number which user want to enter
 * and that test score.</p>
 *
 * @author Sunguk (Edmund) Ham, A00979841
 * @version 1.0
 */
public class TestStudent {
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // String will be used for reading user input and determine whether
        // to repeat or not
        String again = "r";
        String againSetScore = "r";
        
        System.out.println("Instruction: Test number must be 1, 2, or 3."
                + "\nOtherwise the results you will see is incorrect.");
        
        // Do loop that contains whole code.
        // It will not be executed again if user input is q
        do {
            
            // Read user input and used for student's first name
            System.out.println("Enter the student's first name: ");
            String firstName = scan.next();
            
            // Read user input and used for student's last name
            System.out.println("Enter the student's last name: ");
            String lastName = scan.next();
            
            // Read user input and used for student's first test score
            System.out.println("Enter the first test's score of the student: ");
            int score1 = scan.nextInt();
            
            // Read user input and used for student's second test score
            System.out.println("Enter the second test's "
                    + "score of the student: ");
            int score2 = scan.nextInt();
            
            // Read user input and used for student's third test score
            System.out.println("Enter the third test's score of the student: ");
            int score3 = scan.nextInt();
            
            // Declare two student object one having all information, and
            // the other have zero parameter
            Student student1 = new Student(firstName, lastName,
                    score1, score2, score3);
            Student student2 = new Student();
            
            // do loop that reads user input and used for declaring
            // second student's test score.
            do {
                
                // Read user input
                System.out.println("Enter the another student's test number "
                        + "and the test score with a space:");
                int testNumber = scan.nextInt();
                int testScore = scan.nextInt();
            
                // Using user input to declare student's test number and score
                student2.setTestScore(testNumber, testScore);
                
                // Ask user to repeat the loop or not and read user input
                System.out.println("You just entered " + testNumber
                        + " test's score: " + student2.getTestScore(testNumber)
                        + "\nDo you want to enter again? If not, enter q"
                        + " otherwise enter any character.\n"
                        + "It should be the same student.");
                againSetScore = scan.next();
                
            } while (!againSetScore.equalsIgnoreCase("q"));
            
            // Declare students average score
            student1.average();
            student2.average();
            
            // Print students information
            System.out.println(student1);
            System.out.println(student2);
            
            // Ask user to repeat the loop or not and read user input
            System.out.println("Do you want to run this program again?\nIf not,"
                    + " enter q otherwise enter any character.");
            again = scan.next();
            
            
        } while (!again.equalsIgnoreCase("q")); 
        
        
        
    }

};
