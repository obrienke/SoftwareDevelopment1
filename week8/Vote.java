import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter age: ");
        age = input.nextInt();

        if(age >= 18){
            System.out.println("You are old enough to vote");
        }else{
            System.out.println("You are not old enough to vote");
        }

        // if/else - alternative using single selection if statement 
        if(age >= 18){
            System.out.println("You are old enough to vote");
        }
        if(age < 18){
            System.out.println("You are not old enough to vote");
        }

        input.close();
    }
}
