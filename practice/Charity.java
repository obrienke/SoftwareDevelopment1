import java.util.Scanner;
public class Charity{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double amt;

        System.out.println();
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter donation amount: ");
        amt = input.nextDouble();

        System.out.println();    
        if(amt < 20){
            System.out.println("Thanks "+name+" for your donation. We will use it to purchase a book for a person in need");
        }else if(amt <= 40){
            System.out.println("Thanks "+name+" for your donation. We will use it to purchase a clothes voucher for a person in need");
        }else{
            System.out.println("Thanks "+name+" for your donation. We will use it to purchase a food hamper for a person in need");
        }
        System.out.println();
        input.close();
    }
}