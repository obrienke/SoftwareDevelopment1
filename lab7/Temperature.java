import java.util.Scanner;
public class Temperature{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        boolean normal = true;
        System.out.print("Enter temperature in Celsius: ");
        temp = input.nextInt();

        if (temp > 40) {
            System.out.println("Extremely Hot");
            normal = false;
        }
        if (temp < 0) {
            System.out.println("Freezing");
            normal = false;
        }
        if (normal) {
            System.out.println("Normal");
        }
        input.close();
    }
}
