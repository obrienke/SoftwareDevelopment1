import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        System.out.println();
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.println();
        if(first < second){
            System.out.println("First number entered is LESS than the second number entered");
        }else{
            System.out.println("First number entered is NOT LESS than the second number entered");
        }
        System.out.println();
        input.close(); 
      }
}
