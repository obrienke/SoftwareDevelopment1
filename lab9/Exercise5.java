import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        String grade = "Fail";

        System.out.print("Enter result: ");
        result = input.nextInt();    
        if(result >= 70){
            grade = "1.1";
        }else if(result >= 60){
            grade = "2.1";
        }else if(result >= 50){
            grade = "2.2";
        }else if(result >= 40){
            grade = "pass";
        }
        System.out.println("Grade: " + grade);
        input.close();
    }
}
