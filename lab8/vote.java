import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 18;
        System.out.print("Enter age: ");
        age = input.nextInt();
        if(age >= 0 && age < 200){
            if(age >= 18){
            System.out.println("You may vote");
            }else{
                System.out.println("You may not vote");
            }
        }else{
            System.out.println("Invalid age");
        }
        
        input.close();
    }
}
