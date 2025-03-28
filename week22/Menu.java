import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        System.out.print("Enter 1 for addition, 2 for mulitplication, 3 to end: ");
        choice = input.nextInt();

        if(choice == 1){
            String[] x = {"100", "200"};
            Exercise1.main(x);
            main(null);
        }else if(choice == 2){
            Exercise2.main(null);
            main(null);
        }else if(choice == 3){
            System.out.println("Program Ends");
        }else{
            System.out.println("Invalid choice, try again");
            main(null);
        }
        input.close();
    }
}
