import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        int result = 0;
        String grade = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter result: ");
        result = input.nextInt();
        if(result >= 90){
            grade = "H1";
        }else if(result >= 80){
            grade = "H2";
        }else if(result >= 70){
            grade = "H3";
        }else if(result >= 60){
            grade = "H4";
        }else if(result >= 50){
            grade = "H5";
        }else if(result >= 40){
            grade = "H6";
        }else if(result >= 30){
            grade = "H7";
        }else if(result >= 0){
            grade = "H8";
        }else{
            grade = "Invalid";
        }

        
        System.out.println("Grade: " + grade);
        input.close();
    }
}
