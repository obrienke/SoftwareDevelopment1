import java.util.Scanner;
public class ThreeMonths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0;

        System.out.print("Enter month number: ");
        month = input.nextInt();

        if(month == 1){
            System.out.println("January");
        }else if(month == 2){
            System.out.println("February");
        }else if(month == 3){
            System.out.println("March");
        }else{
            System.out.println("Month does not exist");
        }
        input.close();   
    }
}
