import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);  
    int result = 0;
    String grade = "Grade: ";

    System.out.print("Enter your result: ");
    result = input.nextInt();
    
    if(result >= 90){
        grade += "A";
    }else if(result >= 70){
        grade += "B";
    }else if(result >= 50){
        grade += "C";
    }else{
        grade += "F";
    }

    System.out.println();
    System.out.println(grade);

    input.close();
  }
}