// feedback form - thanks for your comments, please leave your contact details and we will get back to you.
// number is input as an int - must be converted to string and reformatted to have prefix in brackets and a space to rest of number

import java.util.Scanner;

public class Form {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("GMIT thanks you for your feedback. Please leave your contact details and we will get back to you.");
        System.out.println();
        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.print("Your phone number: ");
        int number = input.nextInt();
        System.out.print("Your email: ");
        String email = input.next();

        String num = Integer.toString(number);
        num = "(0" + num.substring(0,2) + ") " + num.substring(2, num.length());

        String output = "-=======================================-\n";
        output += "-                 GMIT                  -\n";
        output += "-=======================================-\n";
        output += "- Name:\t\t- "+name+" \t-\n";
        output += "-----------------------------------------\n";
        output += "- Phone Number:\t- "+num+" \t-\n";
        output += "-----------------------------------------\n";
        output += "- Email:\t- "+email+" \t-\n";
        output += "-----------------------------------------\n";

        System.out.println(output);
        input.close();
    }
}
