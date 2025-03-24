package week21;
import java.util.Scanner;
public class EightArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] x = {200, 400, 600, 800, 1000};
        int val = 0;
        int found = -1;
        int[] y = new int[x.length - 1];

        System.out.print("Enter a value to remove: ");
        val = input.nextInt();

        for(int i = 0; i < x.length; i++){
            if(x[i] == val){
                found = i;
            }
        }

        if(found > -1){
            // value is found
            for(int i = 0, index = 0; i < x.length; i++){
                if(i != found){
                    y[index++] = x[i];
                }
            }
            for(int i = 0; i < y.length; i++){
                System.out.println(y[i]);

            }
        }else{
            System.out.println(val + " not found in array");
        }
        
        input.close();
    }
}
