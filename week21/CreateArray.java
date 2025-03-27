import java.util.Scanner;
public class CreateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array = 1;
        int size = 0;
        System.out.print("enter 1 for int, 2 for double array: ");
        array = input.nextInt();
        if(array == 1 || array == 2){
            System.out.print("Number of elements: ");
            size = input.nextInt();
        }
        
        if(array == 1){
            int[] values = new int[size];
            for(int i = 0; i < values.length; i++){
                System.out.print("Enter value " + (i + 1) + ": ");
                values[i] = input.nextInt();
            }
            for(int i = 0; i < values.length - 1; i++){
                System.out.print(values[i] + ", ");
            }
            System.out.println(values[values.length - 1]);
        }else if(array == 2){
            double[] values = new double[size];
            for(int i = 0; i < values.length; i++){
                System.out.print("Enter value " + (i + 1) + ": ");
                values[i] = input.nextDouble();
            }
            for(int i = 0; i < values.length - 1; i++){
                System.out.print(values[i] + ", ");
            }
            System.out.println(values[values.length - 1]);
        }else{
            System.out.println("Invalid choice for array type.");
        }
        
        input.close();
    }
}
