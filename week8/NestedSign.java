import java.util.Scanner;
public class NestedSign{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // nested if/else statement
        if(number == 0){
            System.out.println("zero");
        }else{
            if(number > 0){
                System.out.println("positive");
            }else{
                System.out.println("negative");
            }
        }

        // cascading if/else
        if(number == 0){
            System.out.println("zero");
        }else if(number > 0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }

        input.close();
    }
}
