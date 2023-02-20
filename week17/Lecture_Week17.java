import java.util.Scanner;
public class Lecture_Week17{
    public static void main(String[] args) {
        System.out.println("Week 17");
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        do{
            System.out.print("Enter any other value than 0 to exit loop: ");
            i = input.nextInt();
           
        }while(i == 0);
        System.out.println("End");
    }
}