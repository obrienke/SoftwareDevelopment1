import java.util.Scanner;
public class AddWhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        String result = "";
        System.out.println();
        System.out.print("Enter a number: ");
        x = input.nextInt();
        System.out.println();
        if(x > 100){
            result = x + " + 10 = " + (x + 10);
        }else if(x > 50){
            result = x + " + 20 = " + (x + 20);
        }else{
            result = x + " + 30 = " + (x + 30);
        }
        System.out.println(result);
        System.out.println();
        input.close();
    }
}
