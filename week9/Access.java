import java.util.Scanner;
public class Access {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = 0;
        String name = "";
        System.out.print("Enter Id: ");
        id = input.nextInt();
        System.out.print("Enter name: ");
        name = input.next();

        if( (id == 1000 && name.equals("John")) || (id == 2000 && name.equals("Mary")) ){
            System.out.println("Access allowed");
        }else{
            System.out.println("Access denied");
        }
        input.close();
    }
}
