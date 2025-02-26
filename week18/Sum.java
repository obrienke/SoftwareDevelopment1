import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int digit = 0;
        int total = 0;
        String output = "";

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        while(number > 0){
            digit = number % 10;
            total += digit;
            number /= 10;
            output += digit + " + ";
        }

        output = output.substring(0, output.length() - 3);
        String reverse = "";
        for(int i = output.length() - 1; i >= 0; i--){
            reverse += output.charAt(i);
        }

        /*System.out.println("Total: " + total);
        System.out.println("Output: " + output);
        System.out.println("Reverse: " + reverse);*/
        System.out.println("\n" + reverse + " = " + total);
        input.close();
    }
}