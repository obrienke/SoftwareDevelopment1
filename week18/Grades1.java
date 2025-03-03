import java.util.Scanner;
public class Grades1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int grade = 0;
        int total = 0;
        int counter = 1;

        while(counter <= 10){
            System.out.print("Enter result " + counter + ": ");
            grade = input.nextInt();
            total += grade;
            counter++;
        }
        System.out.println("Average: " + (total / 10.0));
        input.close();
    }
}