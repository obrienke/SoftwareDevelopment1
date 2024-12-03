import java.util.Scanner;

public class OneToTen{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number from 1 to 10: ");
        number = kb.nextInt();

        if(number > 0 && number <= 10){
            System.out.println("Valid number entered.");
            if(number % 2 == 0){
                System.out.println(number + " is even");
                System.out.print(number);
                if(number == 2){
                    number = number * 2;
                }else if(number == 4){
                    number = number * 4;
                }else if(number == 6){
                    number = number * 6;
                }else if(number == 8){
                    number = number * 8;
                }else{
                    number = number * 10;
                }
            }else{
                System.out.println(number + " is odd"); 
                System.out.print(number);
                switch(number){
                    case 1:
                        number = number + 1;
                        break;
                    case 3:
                        number = number + 3;
                        break;
                    case 5:
                        number = number + 5;
                        break;
                    case 7:
                        number = number + 7;
                        break;
                    default:
                        number = number + 9;
                }
            }
            System.out.println(" is updated to " + number);
        }else{
            System.out.println("Invalid number entered.");
        }
        kb.close();
    }
}
