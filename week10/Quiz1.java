import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int val = 0;
        String answer;
        int total = 0;
        
        System.out.println("Some question over multiple lines");
        System.out.print("Enter 1 or 2: ");
        val = input.nextInt();
        input.nextLine();
        if(val == 2){
            System.out.println("correct");
            total = total + 1;
        }

        System.out.print("Enter line of code for an answer: ");
        answer = input.nextLine();
        if(answer.equals("Scanner sc = new Scanner(System.in);")){
            System.out.println("correct");
            total = total + 1;
        }

        int grade = (total * 100) / 2;
        System.out.println("Result: " + grade + "%");
        if(grade >= 80){
            System.out.println("Distinction");
        }else if(grade >= 40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        } 

    }
}
