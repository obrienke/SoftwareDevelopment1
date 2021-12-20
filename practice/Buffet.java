import java.util.Scanner;
public class Buffet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        int age;

        System.out.println();
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        System.out.println();
        if(age >= 60){
            System.out.println("It will cost 8.90 to eat all you want from the buffet");
        }else if(age >= 16){
            System.out.println("It will cost 10.95 to eat all you want from the buffet");
        }else if(age >= 6){
            System.out.print("Please enter your weight: ");
            weight = input.nextDouble();
            System.out.println("It will cost " + (Math.round(weight * 0.09 * 100.0) / 100.0) + " to eat all you want from the buffet");
        }else{
            System.out.println("No charge for children who are 5 and under");
        }
        System.out.println();
        input.close();
    }
}
