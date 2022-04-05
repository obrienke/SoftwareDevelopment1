import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int third = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.print("Enter first number: ");
        third = input.nextInt();
        Average a = new Average();
        System.out.println(a.avg(first, second, third));
        input.close();
    }

    public double avg(int x, int y, int z){
        return ((x + y + z) * 1.0) / 3.0;
    }
}
