import java.util.Scanner;
public class ValidId{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Id;
        System.out.println();
        System.out.print("Enter student Id (GMITXXXX): ");
        Id = input.next();
        System.out.println();    
        if(Id.substring(0,4).toUpperCase().equals("GMIT") && Id.length() == 8){
            System.out.println("Id is valid");
        }else{
            System.out.println("Id is not valid");
        }
        System.out.println();
        input.close();
    }
}