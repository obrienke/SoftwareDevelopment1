import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.print(number);
        number += 2;
        System.out.println(" updated to: " + number);
        number -= 5;
        System.out.println("Now updated to: " + number);
        input.close();
    }
}
