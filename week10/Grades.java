import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = 0;
        double result = 0;

        System.out.print("Enter quiz 1 result: ");
        score = input.nextDouble();
        System.out.print("Enter quiz 2 result: ");
        score += input.nextDouble();
        System.out.print("Enter quiz 3 result: ");
        score += input.nextDouble();
        result = score / 3;
        result = Math.round(result * 100.0) / 100.0;
        System.out.println("Average score: " + result);
        if(result >= 90){
            System.out.println("A");
        }else if(result >= 70){
            System.out.println("B");
        }else if(result >= 50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }  
        input.close();       
    }
}
