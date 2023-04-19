import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.print("Enter exam result: ");
        result = input.nextInt();
       
        if(result >= 90){
            System.out.println("A");
        }else if(result >= 70){
            System.out.println("B");
        }else if(result >= 50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
        input.close();
    }
}