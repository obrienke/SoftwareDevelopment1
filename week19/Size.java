import java.util.Scanner;
public class Size{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter size: ");
        number = input.nextInt();
        
        if(number > 70 && number <= 100){
            System.out.println("Go for large size.");
        }else if(number > 35 && number <= 70){
            System.out.println("Go for medium size.");
        }else if(number > 10 && number <= 35){
            System.out.println("Go for small size.");
        }else{
            System.out.println("Size not available.");
        }
        input.close();
    }
}