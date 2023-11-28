import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        if(number == 7){
            System.out.println("Number entered, " + number + ", is equal to 7.");
        }else{
            System.out.println("Number entered, " + number + ", is NOT equal to 7.");
        }
        input.close();
    }
}
