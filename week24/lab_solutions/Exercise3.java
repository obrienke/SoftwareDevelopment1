import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        int age = 0;
        String category = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = input.nextInt();
        if(age >= 50){
            category = "Master";
        }else if(age >= 40){
            category = "Senior";
        }else if(age >= 20){
            category = "Intermediate";
        }else{
            category = "Junior";
        }

        System.out.println();
        System.out.println(category);
        input.close();
    }
}
