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
            choice = 'x'; // used x but any value apart from a, b, c, d, or e would do to represent an invalid choice
        }
        System.out.println();
        if(choice == 'a' || choice == 'A'){
            System.out.print("Enter value for Celsius to convert to Fahrenheit: ");
            from = input.nextDouble();
            System.out.println();
            //F = C * 1.8000 + 32.00
            System.out.println(from+" degrees Celsius is "+(Math.round((from * 1.8000 + 32.00) * 100.0)/100.0)+" degrees Fahrenheit");
        }else if(choice == 'b' || choice == 'B'){
            System.out.print("Enter value for Kilograms to convert to Stones: ");
            from = input.nextDouble();
            System.out.println();
            //st = kg * 0.15747
            System.out.println(from+" Kilograms is "+(Math.round(from * 0.15747 * 100.0)/100.0)+" Stones");
        }else if(choice == 'c' || choice == 'C'){
            System.out.print("Enter value for Kilometres to convert to Miles: ");
            from = input.nextDouble();
            System.out.println();
            //miles = km * 0.6214 
            System.out.println(from+" Kilometres is "+(Math.round(from * 0.6214 * 100.0)/100.0)+" Miles");
        }else if(choice == 'd' || choice == 'D'){
            System.out.print("Enter value for Metres to convert to Feet: ");
            from = input.nextDouble();
            System.out.println();
            //ft = m * 3.2808
            System.out.println(from+" Metres is "+(Math.round(from * 3.2808 * 100.0)/100.0)+" Feet");
        }else if(choice == 'e' || choice == 'E'){
            System.out.print("Enter value for Centimetres to convert to Inches: ");
            from = input.nextDouble();
            System.out.println();
            //in = cm * 0.3937
            System.out.println(from+" Centimetres is "+(Math.round(from * 0.3937 * 100.0)/100.0)+" Inches");
        }else{
            System.out.println("Invalid choice - you must enter a, b, c, d, or e. You entered " + option + ".");
        }
        //could implement this using a switch instead.
        System.out.println();
        input.close();
    }
}
