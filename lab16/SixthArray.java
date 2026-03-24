import java.util.Scanner;
public class SixthArray{
    public static void main(String[] args) {
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int index = -1, number = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for(int i = 0; i < x.length; i++){
            if(x[i] == number){
                index = i;
            }
        } 
        if(index == -1){
           System.out.println("Not found"); 
        }else{
            System.out.println("Found at index " + index);
        }
        input.close();
    }    
}