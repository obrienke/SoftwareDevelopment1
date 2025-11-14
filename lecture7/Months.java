import java.util.Scanner;
public class Months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0, year = 0, feb = 0;
        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter year: ");
        year = input.nextInt();

        if(year%4 == 0){
            feb = 29;
        }else{
            feb = 28;
        }    

        if(month == 1){
            System.out.println("January has 31 days");
        }else if(month == 2){
            System.out.println("February has " + feb + " days");
        }else if(month == 3){
            System.out.println("March has 31 days");
        }else if(month == 4){
            System.out.println("April has 30 days");
        }else{
            System.out.println("Month doesn't exist");
        }

        int x = 7;
        if(x > 0){
            System.out.println(x + " is a positive number");
        }else{
            if(x < 0){
                System.out.println(x + " is a positive number");
            }else{
                System.out.println(x + " is zero");
            }
        }

        input.close();
    }
}
