import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second, third, result;
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        
        result = first + second;
        System.out.println(first + " + " + second + " = " + result);

        third = 10;

        System.out.print(result);

        // Compound Assignment
        //result = result + third;
        result += third;

        System.out.println(" + " + third + " = " + result);

        int number = 0;

        System.out.println(number);
        System.out.println(number++); // postfix incrementor
        System.out.println(number);
        System.out.println(++number); // prefix incrementor
        number--; // postfix decrementor -> number = number - 1; or number -= 1
        System.out.println(number);
        System.out.println(--number); // prefix decrementor

        // more compound assignment examples
        number += 4;
        System.out.println(number);
        number -= 2;
        System.out.println(number);
        number *= 3;
        System.out.println(number);
        number /= 3;
        System.out.println(number);
        number -= 2; // number = number - 2;
        System.out.println(number);
        
        input.close();
    }
}