import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        System.out.print("Enter age: ");
        age = input.nextInt();
        if(age < 13){
            System.out.println("You are too young to have a facebook account");
        }
        if(age < 16){
            System.out.println("You are too young to have a drivers license");
        }
        if(age < 18){
            System.out.println("You are too young to vote");
            System.out.println("You are too young to buy alcohol");
        }
        if(age < 21){
            System.out.println("You are too young to become a TD");
        }
        if(age < 50){
            System.out.println("You are too young to be called old");
        }
        if(age >+ 50){
            System.out.println("You are getting old");
        }

        input.close();
    }
}
