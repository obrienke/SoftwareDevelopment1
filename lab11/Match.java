import java.util.Scanner;
public class Match {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1, str2;

        System.out.print("Enter a string: ");
        str1 = input.nextLine();
        System.out.print("Enter another string: ");
        str2 = input.nextLine();

        if(str1.equals(str2)){
            System.out.println("Strings match");
        }else{
            System.out.println("Strings do not match");
        }
        input.close();
    }
}
