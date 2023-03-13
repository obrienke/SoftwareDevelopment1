import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first=0;
        int result = 0;

        System.out.print("Enter a number: ");
        first = input.nextInt();
        
        if(first >= 4 && first <= 8){
            result = first * 6;
        }else if(first >= 10 && first <= 14){
            result = first * 12;
        }else if(first >= 16 && first <= 20){
            result = first * 18;
        }else if(first >= 22 && first <= 26){
            result = first * 24;
        }else{
            result = first * 3;
        }

        System.out.println("Number updated to " + result);
        input.close();
    }
}