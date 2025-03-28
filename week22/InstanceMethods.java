import java.util.Scanner;
public class InstanceMethods {
    public static void main(String[] args) {
        InstanceMethods im = new InstanceMethods();
        Scanner input = new Scanner(System.in);
        im.method1();
        im.method1();
        im.method2();
        int number = 7;
        im.method3(number);
        number = 10;
        System.out.println("From main method number is: " + number);
        im.method3(100);
        im.method4(number, 9);
        im.method4(number, 9, 8);
        System.out.print("Enter first name: ");
        String fn = input.next();
        System.out.print("Enter last name: ");
        String ln = input.next();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        im.method5(fn, ln, age);
        int x = im.method6(age, number);
        System.out.println("method6 returned " + x);
        System.out.println("method6 returned " + im.method6(age, number));
    }

    int method6(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    void method5(String firstName, String lastName, int age){
        System.out.println(firstName + " " + lastName + " is " + age);
    }
    void method1(){
        System.out.println("Hello from method1");
    }
    void method2(){
        System.out.println("Hello from method2");
    }
    void method3(int number){
        System.out.println("Value to method3: " + number);
    }
    void method4(int first, int second){
        System.out.println(first + " and " + second);
    }
    void method4(int first, int second, int third){
        System.out.println(first + ", " + second + " and " + third);
    }
    
}
