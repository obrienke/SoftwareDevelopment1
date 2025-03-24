package week21;
import java.util.Scanner;
public class SixthArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int found = -1;
        int[] x = {54, 100, 77, 10408};
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for(int i = 0; i < x.length; i++){
            if(x[i] == number){
                found = i;
            }
        }
        if(found > -1){
            System.out.println("Number found at index: " + found);
        }else{
            System.out.println("Number not found");
        }
        input.close();
    }
}
