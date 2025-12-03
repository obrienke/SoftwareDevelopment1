import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight, height, bmi;
        
        System.out.print("Enter weight: ");
        weight = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        bmi = weight / (height * height);
        if(bmi >= 30){
            System.out.println("Obesity");
        }else if(bmi >= 25){
            System.out.println("Overweight");
        }else if(bmi >= 18.5){
            System.out.println("Normal Weight");
        }else{
            System.out.println("Underweight");
        }
       
        input.close();
    }
}
