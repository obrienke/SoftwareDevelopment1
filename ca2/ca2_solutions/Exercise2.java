import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = ""; 
        double rate = 0.87, euro = 20;
        boolean isValid = true;

        System.out.print("Enter name: ");
        name = input.next();
        System.out.print("Enter euro amount: ");
        if(input.hasNextDouble()){ // did not ask for this in assessment. Just including it here for demo purposes.
            euro = input.nextDouble();
        }else{
            System.out.println("Invalid value entered");
            isValid = false;
        }
        System.out.print("Enter sterling conversion rate: ");
        if(input.hasNextDouble()){
            rate = input.nextDouble();
        }else{
            System.out.println("Invalid value entered");
            isValid = false;
        }
        if(isValid){
            System.out.println(name + ", " + (Math.round(euro * 100.0)/100.0) + " euro will get you " + (Math.round(rate * euro * 100.0)/100.0) + " pounds sterling.");
        }
        input.close();
    }
}