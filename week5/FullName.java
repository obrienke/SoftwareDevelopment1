import java.util.Scanner;
public class FullName{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String fn, ln;

        System.out.print("Enter first name: ");
        fn = kb.next();
        System.out.print("Enter last name: ");
        ln = kb.next();

        System.out.println("Hello " + fn.substring(0, 1).toUpperCase() + fn.substring(1).toLowerCase() + 
                            " " + ln.substring(0, 1).toUpperCase() + ln.substring(1).toLowerCase());
        System.out.println("Your name has " + (fn.length() + ln.length()) + " characters");
        kb.close();
    }
}