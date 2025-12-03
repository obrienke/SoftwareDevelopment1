import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println();    
        System.out.print("Enter a number: ");
        if(input.hasNextInt()){
            num = input.nextInt();
            System.out.println();
            if(num > 10){
                System.out.println(num + " is greater than 10");
            }else{
                System.out.println(num + " is not greater than 10");
            }
        }else{
            System.out.println();
            System.out.println(input.nextLine() + " is not a valid number");
        }
        
        System.out.println();
        input.close();
    }
}
