import java.util.Scanner;
public class Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        // nested if else
        if(number > 0){
            System.out.println(number + " is positive");
        }else{
            if(number < 0){
                System.out.println(number + " is negative");
            }else{
                System.out.println(number + " is zero");
            }
        }

        // cascading if else
        if(number > 0){
            System.out.println(number + " is positive");
        }else if(number < 0){
            System.out.println(number + " is negative");
        }else {
            System.out.println(number + " is zero");
        }
        input.close();
    }
}
