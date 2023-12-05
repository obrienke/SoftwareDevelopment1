import java.util.Scanner;
public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double euro, dollars;
        System.out.println();
        System.out.print("Enter the current Euro to US Dollar conversin rate: ");
        dollars = input.nextDouble();
        System.out.print("Enter the amount of Euro to convert to US Dollars: ");
        euro = input.nextDouble();
        System.out.println();
        System.out.println(euro + " euro will get you: " + (Math.round(euro * dollars * 100.0)/100.0) + " US Dollars.");
        System.out.println();
        input.close();
    }
}
