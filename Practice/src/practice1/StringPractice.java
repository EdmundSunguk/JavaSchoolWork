package practice1;

public class StringPractice {
    public static void main(String[] args) {
        String sentence = "Change is inevitable";
        String mutation1, mutation2, mutation3, mutation4;
        
        System.out.println("Original string: \"" + sentence + "\"");
        System.out.println("Length of string: " + sentence.length());
        
        mutation1 = sentence.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3, 30);
        
        // Print each mutated string
        System.out.println("Mutation #1: " + mutation1);
        System.out.println("Mutation #2: " + mutation2);
        System.out.println("Mutation #3: " + mutation3);
        System.out.println("Mutation #4: " + mutation4);

        System.out.println("Mutated length: " + mutation4.length());
    }
}
