import java.util.Scanner;
public class Fullname{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fn, ln;

        System.out.print("Enter first name: ");
        fn = input.next();
        System.out.print("Enter last name: ");
        ln = input.next();

        System.out.println(fn + " " + ln);
        System.out.println(fn.concat(" ").concat(ln)); 
        System.out.println("Hello " + fn.substring(0, 1).toUpperCase() + fn.substring(1).toLowerCase() +
                            " " + ln.substring(0, 1).toUpperCase() + ln.substring(1).toLowerCase());
        System.out.println("Your name has " + (fn.length() + ln.length()) + " characters");
        input.close();
    }
}