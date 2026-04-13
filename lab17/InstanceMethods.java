import java.util.Scanner;
public class InstanceMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InstanceMethods im = new InstanceMethods();
        im.method1();   
        im.method4(100, 2000);  
        System.out.print("Enter first name: ");
        String firstname = input.next();
        System.out.print("Enter surname: ");
        String surname = input.next();
        String fullname = im.method6(firstname, surname);
        System.out.println("Hello " + fullname);
        System.out.println("Result: " + im.method10(100, 10, 1000));
        input.close();
    }
    // part a.
    void method1(){
        System.out.println("Hello from method1");
    }
    //part d.
    void method4(int first, int second){
        System.out.println(first + " and " + second);
    }
    //part g.
    String method6(String fn, String sn){
        return fn + " " + sn;
    }
    //part k.
    int method10(int first, int second, int third){
        return first + second + third;
    }
}
