import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        int total = 0;
        String answer2 = "";

        System.out.println("Question 1");
        System.out.println("1. True");
        System.out.println("2. False");
        System.out.print("Enter answer - 1 or 2: ");
        answer = input.nextInt();

        if(answer == 1){
            total = total + 1;
        }

        System.out.print("Question 2: type in answer: ");
        answer2 = input.nextLine();

        if(answer2.equals("Kevin Test")){
            total = total + 1;
        }

        total = total / 2;

        System.out.println("total: "+total);
        input.close();
    }
}
