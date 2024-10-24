import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0, width= 0, area = 0;
        String unit;

        System.out.print("Enter length of rectangle: ");
        length = input.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = input.nextInt();
        System.out.print("Enter unit of measurement: ");
        unit = input.next();

        area = length * width;
        System.out.println("Area of rectangle is " + area + " " + unit + " squared");

        input.close();
    }
}
