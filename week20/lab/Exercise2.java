import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number != 10){
            System.out.println("Number entered is not 10");
        }else{
            System.out.println("Number entered is 10");
        }
        input.close();
    }    
}
