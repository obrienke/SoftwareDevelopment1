import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean prime = true;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        int i = number - 1;
        while(i > 1){
            if(number % i == 0){
                prime = false;
            }
            i--;
        }

        if(prime){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
        
        input.close();
    }
}
