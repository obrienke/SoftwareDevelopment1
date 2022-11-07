import java.util.Scanner;
public class Lecture{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Topics Covered");
        System.out.println("1. Output");
        System.out.println("2. Variables");
        System.out.println("3. String concatenation");
        System.out.println("4. Arithmetic");
        System.out.println("5. Input");   
        System.out.println("6. String methods"); 

        System.out.print("Print on same line\n");

        int number = 3;
        double dec = 3.4;
        String name = "John";

        number = 5;
        System.out.println("number is " + number);
        System.out.printf("whole is number is %d and decimal number is %f and string %s%n", number, dec, "test");

        int result = 5 + 2 - 3 * 8 / 4;

        System.out.println("Result is: " + result);

        System.out.print("Enter a number: ");
        number = keyboard.nextInt();
        System.out.println("Number entered is: " + number);

        System.out.println(name.charAt(0));

        keyboard.close();
    }
}