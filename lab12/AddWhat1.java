import java.util.Scanner;
public class AddWhat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        if(number > 20){
            number += 2;
        }else if(number > 10 && number <= 20){
            number = number + 3;
        }else if(number <= 10){
            number++;
        }
        System.out.println(number);

        if(number > 20){
            number += 2;
        }else if(number <= 10){
            number++;
        }else{
            number += 3;
        }
        System.out.println(number);
        input.close();
    }
}
