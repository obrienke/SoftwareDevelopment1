import java.util.Scanner;
public class Pay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours, pay, total;
        
        System.out.println();
        System.out.print("Enter hours worked: ");
        hours = input.nextDouble();
        System.out.print("Enter base hourly rate: ");
        pay = input.nextDouble();
        System.out.println();
        
        if(hours > 60){
            total = (pay * 40) + (pay * 20 * 1.5) + (pay * 2 * (hours - 60));
        }else if(hours > 40){
            total = (pay * 40) + (pay * (hours - 40) * 1.5);
        }else{
            total = pay * 40;
        }
        System.out.println();
        System.out.println("Total pay: " + (Math.round(total * 100.0)/100.0));
        System.out.println();
        input.close();
    }
}
