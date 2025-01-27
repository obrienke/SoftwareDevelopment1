import java.util.Scanner;
public class Exercise6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salary = 0;
        double bonus = 0;
        double tax = 0;

        System.out.print("Enter salary: ");
        salary = input.nextDouble();
        System.out.print("Enter bonus: ");
        bonus = input.nextDouble();

        if(salary >= 100000){
            tax = ((salary - 100000) * 0.5) + (70000 * 0.35) + (30000 * 0.25);
        }else if(salary >= 30000){
            tax = ((salary - 30000) * 0.35) + (30000 * 0.25);
        }else{
            tax = salary * 0.25;
        }

        tax = tax + (bonus * 0.4);
        System.out.println("Gross Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Taxes Due: " + tax);
        System.out.println("Net Pay: " + (salary + bonus - tax));

        input.close();
    }
}