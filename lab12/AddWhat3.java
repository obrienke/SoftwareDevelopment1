import java.util.Scanner;
public class AddWhat3 {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();
        if(number > 100){
            number += 10;
        }else if(number > 50){
            number += 5;
        }else if(number > 20){
            number += 2;
        }else{
            number++;
        }
        System.out.println(number);
        input.close();
    }   
}
