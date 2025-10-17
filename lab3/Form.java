import java.util.Scanner;
public class Form {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, email;
        int phone;

        System.out.print("Your name: ");
        name = input.nextLine();
        System.out.print("Your phone number: ");
        phone = input.nextInt();
        System.out.print("Your email: ");
        email = input.next();

        String number = Integer.toString(phone);

        number = "(0" + number.substring(0,2) + ") " + number.substring(2);

        String output = "-=======================================-\n";
        output += "-                 ATU                   -\n";
        output += "-=======================================-\n";
        output += "- Name:\t\t- "+name+" \t-\n";
        output += "-----------------------------------------\n";
        output += "- Phone Number:\t- "+number+" \t-\n";
        output += "-----------------------------------------\n";
        output += "- Email:\t- "+email+" \t-\n";
        output += "-----------------------------------------\n";

        System.out.println(output);
        input.close();
    }
}
