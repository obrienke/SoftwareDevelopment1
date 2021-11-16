import java.util.Scanner;

public class Grades{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String student1, student2, student3, student4, student5, student6, student7, student8, student9, student10;
    int grades1, grades2, grades3, grades4, grades5, grades6, grades7, grades8, grades9, grades10, total;
    double avg;

    System.out.print("Enter Student Id 1: ");
    student1 = input.next();
    System.out.print("Enter grade for student 1: ");
    grades1 = input.nextInt();
    System.out.print("Enter Student Id 2: ");
    student2 = input.next();
    System.out.print("Enter grade for student 2: ");
    grades2 = input.nextInt();
    System.out.print("Enter Student Id 3: ");
    student3 = input.next();
    System.out.print("Enter grade for student 3: ");
    grades3 = input.nextInt();
    System.out.print("Enter Student Id 4: ");
    student4 = input.next();
    System.out.print("Enter grade for student 4: ");
    grades4 = input.nextInt();
    System.out.print("Enter Student Id 5: ");
    student5 = input.next();
    System.out.print("Enter grade for student 5: ");
    grades5 = input.nextInt();
    System.out.print("Enter Student Id 6: ");
    student6 = input.next();
    System.out.print("Enter grade for student 6: ");
    grades6 = input.nextInt();
    System.out.print("Enter Student Id 7: ");
    student7 = input.next();
    System.out.print("Enter grade for student 7: ");
    grades7 = input.nextInt();
    System.out.print("Enter Student Id 8: ");
    student8 = input.next();
    System.out.print("Enter grade for student 8: ");
    grades8 = input.nextInt();
    System.out.print("Enter Student Id 9: ");
    student9 = input.next();
    System.out.print("Enter grade for student 9: ");
    grades9 = input.nextInt();
    System.out.print("Enter Student Id 10: ");
    student10 = input.next();
    System.out.print("Enter grade for student 10: ");
    grades10 = input.nextInt();

	  total = grades1+grades2+grades3+grades4+grades5+grades8+grades7+grades8+grades9+grades10;
    avg = (Math.round(total * 100.0) / 100.0) / 10.0;

    System.out.println();
    System.out.println("-------------------------");
    System.out.println("|#  |Student\t|Grade\t|");
    System.out.println("-------------------------");
    System.out.println("|1  |"+student1+"\t|"+grades1+"\t|");
    System.out.println("-------------------------");
    System.out.println("|2  |"+student2+"\t|"+grades2+"\t|");
    System.out.println("-------------------------");
    System.out.println("|3  |"+student3+"\t|"+grades3+"\t|");
    System.out.println("-------------------------");
    System.out.println("|4  |"+student4+"\t|"+grades4+"\t|");
    System.out.println("-------------------------");
    System.out.println("|5  |"+student5+"\t|"+grades5+"\t|");
    System.out.println("-------------------------");
    System.out.println("|6  |"+student6+"\t|"+grades6+"\t|");
    System.out.println("-------------------------");
    System.out.println("|7  |"+student7+"\t|"+grades7+"\t|");
    System.out.println("-------------------------");
    System.out.println("|8  |"+student8+"\t|"+grades8+"\t|");
    System.out.println("-------------------------");
    System.out.println("|9  |"+student9+"\t|"+grades9+"\t|");
    System.out.println("-------------------------");
    System.out.println("|10 |"+student10+"\t|"+grades10+"\t|");
    System.out.println("-------------------------");
    System.out.println("|   |Total\t|"+total+"\t|");
    System.out.println("-------------------------");
    System.out.println("|   |Average\t|"+avg+"\t|");
    System.out.println("-------------------------");
    input.close();
  }
}