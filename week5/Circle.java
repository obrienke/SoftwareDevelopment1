import java.util.Scanner;
public class Circle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        double pie = 3.1415926535;
        double area = 0;
        String unit;

        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter unit of measurement: ");
        unit = input.next();

        area = pie * radius * radius;
        System.out.println("Area is " + area + " " 
                            + unit + " squared.");
        //round to 2 decimal places
        area = Math.round(area * 100.0) / 100.0;
        System.out.println("Area is " + area + " " 
                            + unit + " squared.");  
        input.close();                                      
    }
}