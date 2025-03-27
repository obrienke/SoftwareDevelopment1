import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int items = 0;
        System.out.print("How many items: ");
        items = input.nextInt();
        String[] list = new String[items];
        System.out.println();
        input.nextLine();
        for(int i = 0; i < items; i++){
            System.out.print("Add item " + (i + 1) + " to list: ");
            list[i] = input.nextLine();
        }
        
        System.out.println("\nShopping List:\n");
        for(int i = 0; i < list.length; i++){
            System.out.println((i + 1) + ". " + list[i]);
        }
        input.close();
    }
}
