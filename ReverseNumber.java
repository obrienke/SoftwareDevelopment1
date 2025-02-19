import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        System.out.println(number + " reversed is:");
        while(number > 0){
            System.out.print(number%10);
            number /= 10;
        }
        System.out.println();
        System.out.println();
        String x;
        System.out.print("Enter number: ");
        x = input.next();
        
        int index = x.length() - 1;
        while(index >= 0){
            System.out.print(x.charAt(index));
            index--;
        }
        System.out.println();
    }
}