import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        System.out.print("Enter age: ");
        age = input.nextInt();
        if(age >= 18){ // if(x > 17)
            System.out.println("You are old enough to vote");
        }else{
            System.out.println("You are too young to vote");
        }

        /* 
        if(age <= 18){ 
            System.out.println("You are too young to vote");
        }else{
            System.out.println("You are old enough to vote");
        }
        */
        input.close();
    }
}
