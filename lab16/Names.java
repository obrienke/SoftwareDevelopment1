import java.util.Scanner;
public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[3];
        for(int i = 0; i < names.length; i++){
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("\nNames:\n-----");
        for(int i = 0; i < names.length; i++){
            System.out.println((i + 1) + ". " + names[i]);
        }
        input.close();
    }
}
