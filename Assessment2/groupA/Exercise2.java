import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int points, games;
        System.out.print("\nEnter team name: ");
        name = input.nextLine();
        System.out.print("Enter number of points: ");
        points = input.nextInt();
        System.out.print("Enter number of games played: ");
        games = input.nextInt();
        System.out.println("\n"+name+" have played "+games+" games and scored "+points+" points.");
        System.out.println("Average points per game is: " +(points*1.0/games*1.0)+"\n");
        input.close();
    }
}