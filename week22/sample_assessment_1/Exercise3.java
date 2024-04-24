import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
    
        System.out.print("Enter age: ");
        age = input.nextInt();
    
        if(age >= 65){
            System.out.println("Senior Citizen");
        }else if(age >= 20){
            System.out.println("Adult");
        }else if(age >= 13){
            System.out.println("Teenager");
        }else if(age >= 4){
            System.out.println("Child");
        }else if(age >= 1){
            System.out.println("Toddler");
        }else{
            System.out.println("Baby");
        }      
        input.close();  
    }
}
