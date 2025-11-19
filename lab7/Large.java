import java.util.Scanner;
public class Large{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0, third = 0;
        int largest = 0;
        System.out.println("Enter 3 numbers: ");
        first = input.nextInt();
        largest = first;
        second = input.nextInt();
        if(second > largest){
            largest = second;
        }
        third = input.nextInt();
        if(third > largest){
            largest = third;
        }
        System.out.println("Largest number is: " + largest);
        input.close();
    }
}