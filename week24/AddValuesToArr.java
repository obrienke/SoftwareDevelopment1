import java.util.Scanner;
public class AddValuesToArr{
    public static void main(String[] args) {
        //int[] numbers = new int[6];
        //int[] numbers = {0, 0, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("How many values do you want in your array: ");
        int vals = input.nextInt();

        int[] numbers = new int[vals];
        for(int i = 0; i < numbers.length; i++ ){
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Index\tValue\n-----\t-----");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(i + "\t" + numbers[i]);
        }

        System.out.println("Index\tValue\n-----\t-----");
        int i = 0; 
        while(i < numbers.length){
            System.out.println(i + "\t" + numbers[i]);
            i++;
        }
        input.close();
    }
}