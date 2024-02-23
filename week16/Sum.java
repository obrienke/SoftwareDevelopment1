import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int digit = 0;
        int total = 0;
        String output = "";

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while(number > 0){
            digit = number % 10;
            number = number / 10;
            total = total + digit;
            output = output + digit;
        }
        
        int i = output.length() - 1;
        while(i >= 0){
            System.out.print(output.charAt(i));
            if(i > 0){
                System.out.print(" + ");
            }
            i--;
        }
        System.out.println(" = " + total);
        
        input.close();
    }
}