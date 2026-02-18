//Exercises 2, 3 and 4.
public class FirstFor {
    public static void main(String[] args) {
        System.out.println("Exercise 2");
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
        }
        System.out.println("Exercise 3");
        for(int i = 20; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Exercise 4");
        int total = 0;
        for(int number = 1; number <= 15; number += 2){
            total += number;
        }
        System.out.println("Total: " + total);
    }
}
