import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println();    
        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.print(num + " is updated to ");
        if(num >= 1 && num <= 10){
            num = num - 10;
        }else if(num >= 21 && num <= 30){
            num = num - 30;
        }else if(num >= 41 && num <= 60){
            num = num - 60;
        }else if(num >= 71 && num <= 75){
            num = num - 75;
        }else{
            num = num - 2;
        }

        System.out.println(num);
        System.out.println();
        input.close();
    }
}
