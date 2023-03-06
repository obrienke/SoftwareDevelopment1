import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args) {
        int number = 0;
        int result = 1;
        String output = "";
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 8; i++){
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();
            if(i == 1 || i == 8){
                result = result * number;
                if(i == 1)
                    output = output + number;
                if(i == 8){
                    output = output += " * ";
                    output += number;
                    output += " = "; 
                }
            }
        }
        System.out.println(output + result);
        input.close();
    }
}