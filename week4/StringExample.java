import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fname = "Kevin";

        String sname = "O'Brien";
        String fullname = "";

        String first = "";
        String last = "";
        fullname = fname.concat(" ").concat(sname);
        System.out.println(fullname);

        System.out.println(fname.concat(" " + sname));

        System.out.print("Enter first name: ");
        first = input.next();
        System.out.print("Enter last name: ");
        last = input.next();

        System.out.println("Fullname: " + first.concat(" " + last));

        System.out.println(fullname.length());
        System.out.println(fullname.charAt(0));
        System.out.println(fullname.substring(0, 5));
        System.out.println(fullname.substring(6));
        System.out.println(fullname.equals("Kevin"));
        System.out.println(fullname.equals("Kevin O'Brien"));
        System.out.println(fullname.toUpperCase());
        input.close();
    }
}
