//Sentinel controlled while loop to solve class average problem
import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int grade = 0;
        int total = 0;
        
        System.out.print("Enter grade (-1 to quit): ");
        grade = input.nextInt();

        while(grade != -1){
            total += grade;
            System.out.print("Enter grade (-1 to quit): ");
            grade = input.nextInt();
            counter++;           
        }

        if(counter != 0){
            System.out.println("Total of the "+counter+" grades entered is: "+total);
            System.out.println("Class average is: "+((double) total/counter));
        }else{
            System.out.println("No grades entered");
        }
        input.close();
    }
}


