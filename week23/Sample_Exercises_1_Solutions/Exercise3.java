import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        int age = 0;
        String category = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = input.nextInt();
        if(age >= 65){
            category = "Senior Citizen";
        }else if(age >= 20){
            category = "Adult";
        }else if(age >= 13){
            category = "Teenager";
        }else if(age >= 4){
            category = "Child";
        }else if(age >= 1){
            category = "Toddler";
        }else if(age == 0){
            category = "Baby";
        }else{
            category = "Invalid";
        }

        System.out.println();
        System.out.println(category);
        input.close();
    }
}
