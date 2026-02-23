import java.util.Scanner;
public class Cubes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, total = 0;
        String output = "";
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for(int i = 1; i <= number; i++){
            total += (i * i * i);
            if(i != number)
                output += (i + "^3 + ");
        }
        output += number + "^3 = " + total;
        System.out.println(output);
        input.close();
    }
}