import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 7;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number == 7){
            System.out.println("Number entered is 7");
        }else{
            System.out.println("Number entered is NOT 7");
        }
        input.close();
    }
}
