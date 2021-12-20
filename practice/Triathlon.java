import java.util.Scanner;
public class Triathlon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int wl_cycling = 200;
        int wl_running = 475;
        int wl_swimming = 275;
        double total_cals = 0;
        System.out.println();
		System.out.print("Enter number of hours spent cycling: ");
		total_cals = total_cals + (input.nextDouble() * wl_cycling);
		System.out.print("Enter number of hours spent running: ");
		total_cals = total_cals + (input.nextDouble() * wl_running);
		System.out.print("Enter number of hours spent swimming: ");
		total_cals = total_cals + (input.nextDouble() * wl_swimming);
        System.out.println();
		System.out.println("Calories lost: " + (Math.round(total_cals * 100.0)/100.0));
		System.out.println("Pounds lost: " + (Math.round(total_cals/3500 * 100.0)/100.0));
        System.out.println();
        input.close();
    }
}