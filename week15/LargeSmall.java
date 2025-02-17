import java.util.Scanner;

public class LargeSmall{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 2;
        int number;
        int largest = 0;
        int smallest = 0;

        System.out.print("Enter number 1: ");
        largest = input.nextInt();
        smallest = largest;

        while(counter < 6){
            System.out.print("Enter number "+counter+": ");
            number = input.nextInt();

            if(largest < number) {
                largest = number;
            }
            if(smallest > number){
				smallest = number;
			}

            counter++;
        }

	System.out.println();
        System.out.println("The largest number is: "+largest);
        System.out.println("The smallest number is: "+smallest);
        System.out.println();
        input.close();
    }
}
