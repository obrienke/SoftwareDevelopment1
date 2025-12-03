import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter year: ");
        year = input.nextInt();
        if(year%4 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is NOT a leap year");
        }
        input.close();
    }
}
