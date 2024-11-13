import java.util.Scanner;
public class AllDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, first, second, third, fourth, fifth;
        System.out.print("Enter a 5 digit number: ");
        number = input.nextInt();

        first = number / 10000;
        second = (number % 10000) / 1000;
        third = ((number % 10000) % 1000) / 100;
        fourth = (((number % 10000) % 1000) % 100) / 10;
        fifth = ((((number % 10000) % 1000) % 100) % 10);

        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth);

        input.close();
    }
}
