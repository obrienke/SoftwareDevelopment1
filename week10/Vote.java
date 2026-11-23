package week10;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        System.out.print("Enter age: ");
        age = input.nextInt();
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        input.close();
    }
}
