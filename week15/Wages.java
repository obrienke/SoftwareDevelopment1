import java.util.Scanner;
public class Wages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours = 0;
        double rate = 0;
        double total = 0;

        int i = 1;
        while(i <= 3){
            System.out.print("Enter hours worked: ");
            hours = input.nextDouble();
            System.out.print("Enter hourly rate: ");
            rate = input.nextDouble();

            if(hours > 40){
                total = (rate * 40) + ((hours - 40) * (rate * 1.5));
            }else{
                total = rate * hours;
            }

            //round total to 2 decimal places
            total = Math.round(total * 100.0) / 100.0;
            System.out.println("Pay for Employee " + i + " : " + total + "\n");
            
            i++;
        }
        input.close();
    }
}
