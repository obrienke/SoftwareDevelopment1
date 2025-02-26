import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 1;
        char again;
        do{
            System.out.print("Enter a number: ");
            count = input.nextInt(); 
            if(count % 2 == 0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
            }          
            System.out.print("Enter y to go again: ");
            again = input.next().charAt(0);
        }while(again == 'Y' || again == 'y');
        System.out.println("Program ends ");
        input.close();
    }
}