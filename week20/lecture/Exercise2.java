import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first=0;

        System.out.print("Enter a number: ");
        first = input.nextInt();
        
        if(first < 50){
            System.out.println("Number entered is less than 50");
        }else{
            System.out.println("Number entered is not nless than 50");
        }

        input.close();
    }
}