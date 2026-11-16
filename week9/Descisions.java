import java.util.Scanner;
public class Descisions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0;
        String str1 = "", str2 = "";

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.print("Enter password: ");
        str1 = input.next();
        System.out.print("Re-Enter password: ");
        str2 = input.next();

        if(first == second){
            System.out.println(first + " is equal to " + second);
        }

        if(first != second){
            System.out.println(first + " is not equal to " + second);
        }

        if(first > second){
            System.out.println(first + " is greater than " + second);
        }

        if(first < second){
            System.out.println(first + " is less than " + second);
        }

        if(first >= second){
            System.out.println(first + " is greater than or equal to " + second);
        }

        if(first <= second){
            System.out.println(first + " is less than or equal to " + second);
        }

        if(str1 == str2){
            System.out.println("Passwords match");
        }
        if(str1 != str2){
            System.out.println("Passwords do not match");
        }
        if("test" == "test"){
            System.out.println("string match");
        }
        if(str1.equals(str2)){
            System.out.println("Passwords match using equals method");
        }
        if(!str1.equals(str2)){
            System.out.println("Passwords do not match using equals method");
        }
        input.close();
    }
}