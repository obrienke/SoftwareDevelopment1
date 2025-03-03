import java.util.Scanner;
public class password{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String pw = "";
        do{
            System.out.print("Enter password: ");
            pw = input.next();           
        }while(!pw.equalsIgnoreCase("mypass"));
        System.out.println("Access granted!");
        input.close();
    }
}