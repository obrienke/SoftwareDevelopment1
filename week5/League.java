import java.util.Scanner;

public class League{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String firstTeam, secondTeam, thirdTeam, fourthTeam;
    int points1, points2, points3, points4;

    System.out.print("Enter team in first place: ");
    firstTeam = input.next();
    System.out.print("Enter points: ");
    points1 = input.nextInt();
    System.out.print("Enter team in second place: ");
    secondTeam = input.next();
    System.out.print("Enter points: ");
	points2 = input.nextInt();
    System.out.print("Enter team in third place: ");
    thirdTeam = input.next();
    System.out.print("Enter points: ");
    points3 = input.nextInt();
    System.out.print("Enter team in fourth place: ");
    fourthTeam = input.next();
    System.out.print("Enter points: ");
    points4 = input.nextInt();

    input.close();
    System.out.println();
    System.out.println("-------------------------");
    System.out.println("|# |Team\t|Points\t|");
    System.out.println("-------------------------");
    System.out.println("|1 |"+firstTeam+"\t|"+points1+"\t|");
    System.out.println("-------------------------");
    System.out.println("|2 |"+secondTeam+"\t|"+points2+"\t|");
    System.out.println("-------------------------");
    System.out.println("|3 |"+thirdTeam+"\t|"+points3+"\t|");
    System.out.println("-------------------------");
    System.out.println("|4 |"+fourthTeam+"\t|"+points4+"\t|");
    System.out.println("-------------------------");
  }
}