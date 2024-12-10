import java.util.Scanner;
public class Zero {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x = 0;
        System.out.println();
        System.out.print("Enter a number: ");
        x  = s.nextInt();
        System.out.println();
        if(x == 0){
            System.out.println("The number entered is EQUAL to zero");
        }else{
            System.out.println("The number entered is NOT EQUAL to zero");
        }
        System.out.println();
        s.close();
    }
}
