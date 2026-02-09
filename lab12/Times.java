import java.util.Scanner;
public class Times {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, choice = 0, i = 1, max = 12;

        System.out.print("Enter number: ");
        number = input.nextInt();
        System.out.print("1. Add, 2. Mulitply: ");
        choice = input.nextInt();
        
        if(choice == 1 || choice == 2){
            while(i <= max){
                if(choice == 1){
                    System.out.println(number + " + " + i + " = " + (i + number));
                }else{
                    System.out.println(number + " * " + i + " = " + (i * number));
                }
                i++;
            }
        }else{
            System.out.println("Invalid choice");
        }
        input.close();
    }
}
