/*
 * Not an exact solution for Exercise 5 as per assessment
 * Amended the requirements slightly for feedback to enable a better solution
 * Feedback output by this program won't be the same as specified in the assessment.
 * It is worded slightly differently.
 */

import java.util.Scanner;
public class Exercise5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int result = 0;
        boolean part = false;
        boolean sub = false;
        String grade = "";
        String postfix = "";
        String feedback = "";

        System.out.print("Enter a result: ");
        result = input.nextInt();

        if(result >= 50){
            System.out.print("Did student fully participate (true/false): ");
            part = input.nextBoolean();
            System.out.print("Did student submit all projects (true/false): ");
            sub = input.nextBoolean();
            if(sub && part){
                postfix = "+";
            }else if(!sub && !part){
                postfix = "-";
                feedback = ", but make sure to submit all projects and participate more";
            }else if(!sub){
                feedback = ", but make sure to submit all projects";
            }else{
                feedback = ", but make sure to participate more";
            }
        }
        if(result >= 90 && result <= 100){
            grade = "A";
            feedback = "Excellent work" + feedback;
        }else if(result >= 70 && result < 90){
            grade = "B";
            feedback = "Very good work" + feedback;
        }else if(result >= 50 && result < 70){
            grade = "C";
            feedback = "Good work" + feedback;
        }else if(result >= 40 && result < 50){
            grade = "D";
            feedback = "Need to improve. Just about getting by.";
        }else{
            grade = "F";
            feedback = "Need to work harder.";
        }
        System.out.println("Grade: " + (grade + postfix));
        System.out.println("Feedback: " + feedback);
        input.close();
    }
}