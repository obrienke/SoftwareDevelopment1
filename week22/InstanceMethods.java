import java.util.Scanner;
public class InstanceMethods{
    public static void main(String[] args) {
        InstanceMethods im = new InstanceMethods();
        Scanner input = new Scanner(System.in);
        String firstname = "";
        String surname = "";
        im.method1();
        im.method2();
        im.method2();
        im.method3(10);
        im.method3(20);
        im.method4(25, 50);
        im.method5(3, 6, 9);
        im.method6("Kevin", "O'Brien");

        System.out.print("Enter first name: ");
        firstname = input.next();
        System.out.print("Enter surname: ");
        surname = input.next();
        im.method6(firstname, surname);
        im.method7(firstname, 100);

        int x = im.method8();
        System.out.println("method8: " + x);

        String name = im.method9(firstname, surname);
        System.out.println("method9: " + name);

        int result = im.method10(10, 20, 40);
        System.out.println("method10: " + result);

        input.close();
    } // end main

    // part k - input three values, integer output
    int method10(int x, int y, int z){
        int result = x + y + z;
        return result;
    } 
    // part j - input two values, String output
    String method9(String x, String y){
         return x + " " + y;
    }

    // part i - no inputs, integer output
    int method8(){
       return 10; 
    }
    // part h - input two values, no output
    void method7(String name, int x){
        System.out.println("method7: " + name + " and " + x);
    }
    // part f and g. - input two values, no output
    void method6(String x, String y){
        System.out.println("method6: " + x + " " + y);
    }
    // part e. - input three values, no output
    void method5(int x, int y, int z){
        System.out.println("method5: " + x + ", " + y + " and " + z);
    }
    // part d. - input two values, no output
    void method4(int x, int y){
        System.out.println("method4: " + x + " and " + y);
    }
    // part c. - input a single value, no output
    void method3(int x){
        System.out.println("method3: " + x);
    }
    // part b. - no input or output
    void method2(){
        System.out.println("Hello from method2");    
    }
    // part a. - no input or output
    void method1(){
        System.out.println("Hello from method1");    
    }
} // end class