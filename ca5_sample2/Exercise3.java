import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        System.out.print("Enter grade: ");
        grade = input.nextInt();

        if(grade >= 90){
            System.out.println("A");
        }else if(grade >= 70){
            System.out.println("B");
        }else if(grade >= 50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
        input.close();
    }
}
