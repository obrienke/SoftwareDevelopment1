import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println();    
        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.print(num + " is updated to ");
        if(num > 1 && num < 5){
            num = num + 1;
        }else if(num > 21 && num < 25){
            num = num + 2;
        }else if(num > 41 && num < 45){
            num = num + 3;
        }else{
            num = num * 2;
        }

        System.out.println(num);
        System.out.println();
        input.close();
    }
}
