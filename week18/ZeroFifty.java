import java.util.Scanner;
public class ZeroFifty{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 1;
        do{
            System.out.print("Enter a number: ");
            count = input.nextInt();           
        }while(count > 0 && count < 50);
        System.out.println("Program ends: " + count);
        input.close();
    }
}