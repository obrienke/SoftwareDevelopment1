import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pw = "";
        int attempts = 0;
        do{
            System.out.print("Enter password: ");
            pw = input.next();
            attempts++;
        }while(!pw.equals("mypass") && attempts < 3);
        if(attempts < 3)
            System.out.println("Access granted");
        else
            System.out.println("Access denied");
        input.close();
    }
}
