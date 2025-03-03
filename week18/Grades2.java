import java.util.Scanner;
public class Grades2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int grade = 0;
        int total = 0;
        int counter = 0;
        while(grade != -1){
            System.out.print("Enter grade (-1 to quit): ");
            grade = input.nextInt();
            if(grade != -1){
                total += grade;
                counter++;
            }
        }
        if(counter != 0){
            System.out.println("Total: " + (total / (counter * 1.0)));  
        }else{
            System.out.println("No grades entered");
        }
        input.close();
    }
}