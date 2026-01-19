import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        int age;
        double pie;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter a value for Pi to 5 decimal places: "); //3.14159
        pie = input.nextDouble();

        System.out.println(name + " is " + age + ".");
        System.out.println("Pi rounded to 5 decimal places is: " + pie);
        System.out.println("Pi rounded to 4 decimal places is: " + Math.round(pie* 10000)/10000.0);
        System.out.printf("Pi rounded to 4 decimal places is: %.4f%n", pie);
        System.out.printf("My name is %s and my age is %d%n", "kevin", age);
        input.close();
    }
}
