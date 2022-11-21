import java.util.Scanner;
public class Decisions {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        boolean x = false;
        
        System.out.print("Enter a number: ");
        number = input.nextInt();
        x = (5 == 5);

        System.out.println("does 5 equal 5: " + x );

        x = (5 == 6);

        System.out.println("does 5 equal 6: " + x );

        x = (5 <= 6);

        System.out.println("Is 5 less than or equal to 6: " + x );

        x = (5 < 5);

        System.out.println("Is 5 less than 5: " + x );

        x = (5 >= 6);

        System.out.println("Is 5 greater than or equal to 6: " + x );

        x = (5 > 4);

        System.out.println("Is 5 greater than 4: " + x );

        x = (5 != 6);

        System.out.println("Is 5 not equal to 6: " + x );

        if(true){
            System.out.println("If statement evaluate to true");
            System.out.println("So code in this block runs");
        }

        if(number < 100){
            System.out.println("Number entered is less than 100");
        }

        System.out.println("Program ends");
        input.close();
    }
}
