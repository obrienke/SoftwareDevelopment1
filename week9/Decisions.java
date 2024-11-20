import java.util.Scanner;
public class Decisions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        boolean result = true;

        System.out.print("Enter a number: ");
        x = input.nextInt();

        result = (x == 5);
        System.out.println(x + " == 5 - " + result);
        result = (x > 10);
        System.out.println(x + " > 10 - " + result);
        result = (x >= 10);
        System.out.println(x + " >= 10 - " + result);
        result = (x < 10);
        System.out.println(x + " < 10 - " + result);
        result = (x <= 10);
        System.out.println(x + " <= 10 - " + result);
        result = (x != 10);
        System.out.println(x + " != 10 - " + result);

        int age = 0;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        if(age >= 18){
            System.out.println("You are old enough to vote if you want...");
        }

        int score = 0;
        System.out.print("Enter score: ");
        score = input.nextInt();
        if(score > 40){
            System.out.println(score + " is greater than 40");
        }
        if(score >= 40){
            System.out.println(score + " is greater than or equal to 40");
        }
        if(score < 40){
            System.out.println(score + " is less than 40");
        }
        if(score <= 40){
            System.out.println(score + " is less than or equal to 40");
        }
        if(score != 40){
            System.out.println(score + " is not equal to 40");
        }
        input.close();
    }
}