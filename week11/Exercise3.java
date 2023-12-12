import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours = 0;
        double wage = 15.75;

        System.out.print("John, how many hours do you work in a week? Enter here: ");
        hours = input.nextDouble();

        System.out.println("Total weekly wage (gross): " + (hours * wage));
        System.out.println("Tax deductible (20 percent): " + ((hours * wage) * 0.2));
        System.out.println("Total weekly wage (net): " + ((hours * wage) - ((hours * wage) * 0.2)));
        System.out.printf("Total weekly wage (net): %.2f%n", ((hours * wage) - ((hours * wage) * 0.2)));

        input.close();
    }
}
