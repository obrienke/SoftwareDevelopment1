import java.util.Scanner;
public class Iterations{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, result = 0;
        String output = "";
        int i = 1;
        while(i <= 3){
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();
            output += number + " + ";
            result += number;
            i++; // i = i + 1, i += 1
        }
        output = output.substring(0, output.length() - 3);
        //System.out.println("Numbers entered are: " + output);
        System.out.println(output + " = " + result);

        input.close();
    }
}