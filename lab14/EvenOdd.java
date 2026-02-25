import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        char quit = 'N';
        do{
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number%2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
            System.out.print("Quit, (Y for yes, N for no): ");
            quit = input.next().charAt(0);
        }while(quit == 'N' || quit == 'n');
        System.out.println("End");
        input.close();
    }
}
