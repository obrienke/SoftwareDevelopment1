import java.util.Scanner;

public class QuizExample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char answer;
        int result = 0;
        System.out.println("The monday quiz");
        System.out.println();
        System.out.println("Question 1");
        System.out.println();
        System.out.println("How many elephants are needed to lift a truck?");
        System.out.println();
        System.out.println("a. 1");
        System.out.println("b. 3");
        System.out.println("c. 6");
        System.out.println("d. 7");
        System.out.println();
        System.out.print("Enter your choice (a, b, c, or d): ");
        answer = input.next().charAt(0);
        if(answer == 'c'){
            System.out.println("Correct");
            result = result + 1;
        }else if(answer == 'a' || answer == 'b' || answer == 'd'){
            System.out.println("Incorrect");
        }else{
            System.out.println("Invalid answer. Must be a, b, c, or d");
        }

        System.out.println();
        System.out.println("Question 2");
        System.out.println();
        System.out.println("Who won the world cup in 1970?");
        System.out.println();
        System.out.println("a. Italy");
        System.out.println("b. Brazil");
        System.out.println("c. Ireland");
        System.out.println("d. France");
        System.out.println();
        System.out.print("Enter your choice (a, b, c, or d): ");
        answer = input.next().charAt(0);
        if(answer == 'b'){
            System.out.println("Correct");
            result = result + 1;
        }else if(answer == 'a' || answer == 'c' || answer == 'd'){
            System.out.println("Incorrect");
        }else{
            System.out.println("Invalid answer. Must be a, b, c, or d");
        }     
        
        String ans = "";
        System.out.println();
        System.out.println("Question 3");
        System.out.println();
        System.out.print("Who won the 1970 world cup? ");
        ans = input.next();
        if(ans.equals("Brazil")){
            System.out.println("Correct");
            result = result + 1; 
        }else{
            System.out.println("Incorrect");
        }
        System.out.println("Quiz Total Score: " + result + " out of 3.");
        System.out.println("Quiz Total Score %: " + ((result/3.0)*100.0));
        input.close();
    }
}