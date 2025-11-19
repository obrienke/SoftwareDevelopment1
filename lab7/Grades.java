import java.util.Scanner;
public class Grades{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        char grade;
        System.out.print("Enter result: ");
        result = input.nextInt();

        if(result >= 85){
            grade = 'A';
        }else if(result >= 70){
            grade = 'B';
        }else if(result >= 55){
            grade = 'C';
        }else if(result >= 40){
            grade = 'D';
        }else{
            grade = 'F';
        }        
        System.out.println("Grade: " + grade);

        if(result >= 85){
            grade = 'A';
        }else if(result >= 70 && grade < 85){
            grade = 'B';
        }else{
            grade = 'F';
        }
        System.out.println("Grade: " + grade);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        boolean hasConsent = false;
        if(age >= 18 || hasConsent){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        
        boolean freepass = true;
        if((result >= 70 && result <= 85) || freepass){
            System.out.println("You may proceed to next level.");
        }

        System.out.println("Who won the 1988 All Ireland Hurling Final?");
        System.out.println("1. Cork");
        System.out.println("2. Galway");
        System.out.println("3. Wexford");
        System.out.println("4. Dublin");
        System.out.print("Enter answer, 1 - 4: ");
        int answer = input.nextInt();

        switch(answer){
            case 1:
                System.out.println("Incorrect");
                break;
            case 2:
                System.out.println("Correct");
                break;
            case 3:
                System.out.println("Incorrect");
                break;
            case 4:
                System.out.println("Incorrect");
                break;
            default:
                System.out.println("Invalid choice");
        }

        switch(answer){
            case 2:
                System.out.println("Correct");
                break;
            default:
                System.out.println("Incorrect");
        }

        switch(grade){
            case 'A':
                System.out.println("Great Result");
                break;
            default:
                System.out.println("Not a great Result");
        }
        input.close();
    }
}
