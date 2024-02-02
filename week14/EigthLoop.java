import java.util.Scanner;
public class EigthLoop{
    public static void main(String[] args) {
        int x = 1;
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();
        while(x <= 5){
            System.out.println(x + " times " + number + " = " + (number * x));
            x++;
        } 
        input.close();   
    }
}
 