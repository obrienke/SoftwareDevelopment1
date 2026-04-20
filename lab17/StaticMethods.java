import java.util.Scanner;
public class StaticMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method1();   
        method4(100, 2000);  
        System.out.print("Enter first name: ");
        String firstname = input.next();
        System.out.print("Enter surname: ");
        String surname = input.next();
        String fullname = method6(firstname, surname);
        System.out.println("Hello " + fullname);
        System.out.println("Result: " + method10(100, 10, 1000));
        input.close();
    }
    // part a.
    static void method1(){
        System.out.println("Hello from method1");
    }
    //part d.
    static void method4(int first, int second){
        System.out.println(first + " and " + second);
    }
    //part g.
    static String method6(String fn, String sn){
        return fn + " " + sn;
    }
    //part k.
    static int method10(int first, int second, int third){
        return first + second + third;
    }
}
