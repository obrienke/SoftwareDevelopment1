import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        char choice;
        double from;
        System.out.println("Please choose what unit of measurement you want to convert from and to?");
        System.out.println();
        System.out.println("a. Celsius to Fahrenheit");
        System.out.println("b. Kilograms to Stones");
        System.out.println("c. Kilometres to Miles");
        System.out.println("d. Metres to Feet");
        System.out.println("e. Centimetres to Inches");
        System.out.println();
        System.out.print("Enter choice - a,b,c,d, or e: ");
        option = input.next();
        
        if(option.length() == 1){
            choice = option.charAt(0);
        }else{
            choice = 'x';
        }

        if(choice == 'a' || choice == 'A'){
            System.out.print("Enter value to convert: ");
            from = input.nextDouble();
            System.out.println(from+" degress celcius is " + (Math.round((from * 1.8 * 32)*100.0)/100.0) + " degrees fahrenheit.");
        }else{
            //invalid choice
        }
        
        System.out.println();
        input.close();
    }
}
