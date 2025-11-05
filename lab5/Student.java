package lab5;
import java.util.Scanner;
public class Student{
    public static void main(String[] args) {
        String name, id;
        int age;
        double grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter student Id: ");
        id = input.next();
        System.out.print("Enter average grade: ");
        grade = input.nextDouble();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.println("+-----------------------------------------------+");
        System.out.println("| " + name + "\t| " + id + "\t| " + grade + "\t| " + age + "\t|");
        System.out.println("+-----------------------------------------------+");
        input.close();
    }    
}
