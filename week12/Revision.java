import java.util.Scanner;

public class Revision{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 3;
        double num2 = 4.3;
        String name = "Software Development";

        System.out.println("Values are " + num1 + ", " + num2 + " and " + name);

        System.out.print("Enter a whole number: ");
        num1 = input.nextInt();
        System.out.print("Enter a decimal number: ");
        num2 = input.nextDouble();
        System.out.print("Enter module name: ");
        name = input.next();
        //input.nextLine();
        //name = input.nextLine();

        System.out.println("Values entered are " + num1 + ", " + num2 + " and " + name);

        System.out.println(name + " contains " + name.length()+ " characters");

        if(num1 > 2){ // relational operators: >, >=, <, <=, ==, !=
            System.out.println(num1 + " is greater than 2");
        }else{
            System.out.println(num1 + " is not greater than 2");
        }

        if(num1 < 10){
            System.out.println(num1 + " is less than 10");
        }else if(num1 > 20){
            System.out.println(num1 + " is greater than 20");
        }else{
            System.out.println(num1 + " is between 10 and 20");
        }

        switch(num1){
            case 1:
                System.out.println("Switch 1");
                break;
            case 2:
                System.out.println("Switch 2");
                break;
            default:
                System.out.println("Switch default");
        }

        if((num1 > 10 && num1 < 20) || num1 == 3){
            System.out.println(num1 + " is valid");
        }else{
            System.out.println(num1 + " is not valid");
        }

        num2 = 34.345345;
        System.out.printf("printf: %.2f%n", num2);
        System.out.println(num2 * 100);
        System.out.println(Math.floor(num2 * 100));
        System.out.println(Math.floor(num2 * 100) / 100);

        input.close();
    }
}