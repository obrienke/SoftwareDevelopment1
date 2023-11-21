import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // check if number entered is even
        if((number % 2) == 0){
            System.out.println("Number is even");
        }

        // check if number entered is odd
        if((number % 2) != 0){
            System.out.println("Number is odd");
        }

        int result = number % 2;
        if(result != 0){
            System.out.println("Number is odd");
        }

        input.close();
    }
}
