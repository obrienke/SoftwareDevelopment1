import java.util.Scanner;

public class EightArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int[] y = new int[9];
        boolean found = false;

        System.out.print("Enter value: ");
        int search = input.nextInt();

        for(int i = 0; i < x.length; i++){
            if(x[i] == search){
                found = true;
            }
        }
        
        if(found){
            for(int i = 0, j = 0; i < x.length; i++, j++){
                if(x[i] != search){
                    y[j] = x[i];

                }else{
                    j--;
                } 
            }
        
            System.out.println("Index\tValue");
            System.out.println("-----\t-----\n");
            for(int i = 0; i < y.length; i++){
            System.out.println(i + "\t" + y[i]); 
            }
        }else{
            System.out.println("No value removed");
        }
        input.close();
    }
}