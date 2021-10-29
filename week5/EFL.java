// strict requirements
// only allowed one string variables
// this variable is added to throughout the program and then you assign this var to println

import java.util.Scanner;

public class EFL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Requirement 
        String output = "+-------------------------------------------------------+\n";
        output += "| # | Team \t\t| P | W | D | L | Points\t|\n";
        output += "+-------------------------------------------------------+\n";

        //Team 1
        output += "| 1 | ";
        System.out.print("Enter Team 1: ");
        output += sc.nextLine() + "\t\t| ";
        System.out.print("Enter Number of games played by Team 1: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of games won by Team 1: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of games drawn by Team 1: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of games lost by Team 1: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of points for Team 1: ");
        output += sc.next() + "\t\t|\n";
        output += "+-------------------------------------------------------+\n";

        //Team 2
        sc.nextLine(); // required to consume the previous newline from next() on line 25.
        output += "| 2 | ";
        System.out.print("Enter Team 2: ");
        output += sc.nextLine() + "\t\t| ";
        System.out.print("Enter Number of games played by Team 2: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of games won by Team 2: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of games drawn by Team 2: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of games lost by Team 2: ");
        output += sc.next() + " | ";
        System.out.print("Enter Number of points for Team 2: ");
        output += sc.next() + "\t\t|\n";
        output += "+-------------------------------------------------------+\n";

        System.out.println(output);
        sc.close();
    }
}
