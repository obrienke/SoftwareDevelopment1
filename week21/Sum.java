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
        output = Integer.toString(number); // converts the number to a string
        
        while(number > 0){
            digit = number % 10;
            number /= 10;
            total += digit;
            //output += digit + " + ";
        }
        
        System.out.println(output);
        System.out.print(output.charAt(0));
        for(int i = 1; i < output.length(); i++){
            System.out.print(" + "+ output.charAt(i));
        }
        System.out.print(" = " + total);
        
        input.close();
    }
}