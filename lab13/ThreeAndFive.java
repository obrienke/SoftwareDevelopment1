import java.util.Scanner;
public class ThreeAndFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number == 1){
            System.out.println("The first number divisible by 3 and 5 is 15");
        }else if(number < 1){
            System.out.println("You must enter a value greater than 0");
        }else{
            for(int i = 1, total = 0; total < number; i++){
                if(i%3 == 0 && i%5 == 0){
                    System.out.print(i + " ");
                    total++;
                }
            }
        }
        System.out.println();
        input.close();
    }
}
