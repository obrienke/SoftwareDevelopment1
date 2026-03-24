import java.util.Scanner;
public class FifthArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[8];
        int total = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(i + "\t" + numbers[i]);
            total += numbers[i];
        }
        System.out.println("Average: " + ((total * 1.0)/numbers.length));
        input.close();
    }
}
