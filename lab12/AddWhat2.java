import java.util.Scanner;
public class AddWhat2 {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();
        if(number > 100){
            number *= 10;
        }else if(number > 75){
            number *= 8;
        }else if(number > 50){
            number *= 6;
        }else if(number > 25){
            number *= 4;
        }else{
            number /= 2;
        }
        System.out.println(number);
        input.close();
    }   
}
