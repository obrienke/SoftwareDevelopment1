// exercise 9
import java.util.Scanner;
public class Match {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = "";
        String last = "";

        System.out.print("Enter first string: ");
        first = input.next();
        System.out.print("Enter second string: ");
        last = input.next();

        if(first.equals(last)){
            System.out.println("Values match"); // true
        }else{
            System.out.println("Values do not match"); // false
        }

        input.close();
    }
}
