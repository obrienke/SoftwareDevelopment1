import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        int valid = 0;
        while(valid == 0){
            System.out.print("Enter age: ");
            age = input.nextInt();
            if(age > 0 && age < 101){
                for(int i = 1; i <= age; i++){
                    System.out.println(i + ". Kevin");
                }
                valid = 1;
            }else{
                System.out.println("Invalid age");
            }
        }
        input.close();
    }
}
