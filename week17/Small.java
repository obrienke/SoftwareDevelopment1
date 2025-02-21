import java.util.Scanner;
public class Small{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numbers = 0, smallest = 0, number = 0 , count = 1;
        System.out.print("Enter number of integers: ");
        numbers = input.nextInt();
        System.out.print("Enter number " + count + ":  ");
        smallest = input.nextInt();
        numbers--;
        count++;
        for( ; numbers > 0; numbers--, count++){
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();
            if(number < smallest){
                smallest = number;
            }
        }
        System.out.println("Samllest integer is: " + smallest);
        System.out.println();
        input.close();
    }
}