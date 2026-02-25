import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0, grade = 0, total = 0;

        System.out.print("Enter a grade (negative number to quit): ");
        grade = input.nextInt();
        while(grade > 0){
            total += grade;
            System.out.print("Enter a grade (negative number to quit): ");
            grade = input.nextInt();
            counter++;
        }

        System.out.println("Average grade is: " + ((double) total / counter));
        input.close();
    }
}
