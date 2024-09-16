package unit3_testscores;

import java.util.Scanner;


public class Unit3_TestScores {

    public static void main(String[] args) {
        // We will assign a letter grade based on their exam score
        // More than 100  -> ERROR
        // 90 - 100       -> A
        // 80 - 89        -> B
        // 70 - 79        -> C
        // 60 - 69        -> D
        // 0 - 59         -> F
        // Less than 0    -> ERROR
        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter their test score
        System.out.print("Enter your test score: ");
        int score = input.nextInt();
        
        System.out.println ("Example with NO else statements");
        // Determine the letter grade using if-else statements
        if (score > 100) {
            System.out.println("ERROR: Invalid score. Score cannot be more than 100.");
        }
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is: A");
        }
        if (score >= 80 && score <= 89) {
            System.out.println("Your grade is: B");
        }
        if (score >= 70 && score <= 79) {
            System.out.println("Your grade is: C");
        }
        if (score >= 60 && score <= 69) {
            System.out.println("Your grade is: D");
        }
        if (score >= 0 && score <= 59) {
            System.out.println("Your grade is: F");
        }
        if (score < 0) {
            System.out.println("ERROR: Invalid score. Score cannot be less than 0.");
        }
        
        System.out.println ("Example with ELSE statements");
        if (score > 100) {
            System.out.println("ERROR: Invalid score. Score cannot be more than 100.");
        } else if (score >= 90) {
            System.out.println("Your grade is: A");
        } else if (score >= 80) {
            System.out.println("Your grade is: B");
        } else if (score >= 70) {
            System.out.println("Your grade is: C");
        } else if (score >= 60) {
            System.out.println("Your grade is: D");
        } else if (score >= 0) {
            System.out.println("Your grade is: F");
        } else {
            System.out.println("ERROR: Invalid score. Score cannot be less than 0.");
        }
        
        System.out.println ("Example with Grade string");
        String grade = "";
        if (score > 100) {
            grade = "Error";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score >= 0) {
            grade = "F";
        } else {
            System.out.println("ERROR");
        }
        System.out.println("Your grade is: " + grade);

    }
    
}
