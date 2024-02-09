import java.util.Scanner;

public class AddWhat1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        
        System.out.print("Enter a number: ");
        x = input.nextInt();

        if(x > 20){
            x += 2;
        }else if(x > 10 && x <= 20){
            x = x + 3;
        }else if(x <= 10){
            x++;
        }

        System.out.println("Number updated: " + x);
        input.close();
    }
}