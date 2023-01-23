import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double conv;
        System.out.print("\nEnter first name: ");
        name = input.next();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter euro to sterling conversion rate: ");
        conv = input.nextDouble();
        System.out.println("\n"+name+" you are "+age+" years of age.");
        System.out.println("If you had a euro for each year of your life, it would be worth "
                            +(age * conv)+" pounds sterling");        
        input.close();
    }
}