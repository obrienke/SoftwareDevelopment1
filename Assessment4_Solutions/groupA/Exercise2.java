import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        if(number < 50){
            System.out.println("Number entered is less than 50");
        }else{
            System.out.println("Number entered is not less than 50");
        }

        input.close();
    }
}
