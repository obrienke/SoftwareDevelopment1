/*This program prompts a user to enter as many numbers as they want, 
and calculates the average number from the numbers entered. 
A do while loop is used for this purpose. 

The program also demonstrates a while loop which iterates 5 times
The while loop is then rewritten as a for loop to achieve the same
outcome*/

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int total = 0;
        int number = 0;
        do{
           System.out.print("Enter a positive number (-1 to quit): ");
           number = input.nextInt(); 
           if(number != -1){
              total = total + number;
              x++;    
           }
           
        }while(number != -1);

        if(total != 0){
            System.out.println("Average number is "+(total / x ));
        }

        int counter = 1;
        while(counter <= 5){
            System.out.println("Loop "+counter);
            counter++;
        }

        for(int i = 1; i <= 5; i++){
            System.out.println("For Loop "+i);
        }
        
        input.close();
    }
}
