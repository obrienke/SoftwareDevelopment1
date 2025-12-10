import java.util.Scanner;

public class Exercise6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double target = 0, distance;
        char metric = 'a';
        String unit = "miles";
        System.out.println();
        System.out.print("Enter target time in minutes: ");
        target = input.nextDouble();
        System.out.println("Preferred metric: ");
        System.out.println("a. Miles ");
        System.out.println("b. Kilometres ");
        System.out.print("Enter a or b: ");
        metric = input.next().charAt(0);
        if(metric == 'b'){
            unit = "kilometres";
        }
        System.out.print("\nEnter target distance in " + unit + ": ");
        distance = input.nextDouble();
        System.out.println("\nPace required to run " + distance + " " + unit + " in " + target + " minutes is:");
        System.out.printf("%.2f minutes per %s.%n", (target/distance), unit.substring(0, unit.length() - 1));
        System.out.println();
        input.close();
    }
}