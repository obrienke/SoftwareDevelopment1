// exercise 5
public class Exercise5{
    public static void main(String[] args) {
        int number = 1;
        for(int i = 1; i <= 5; i++){
            System.out.print("Line " + i + ": ");
            for(int j = 1; j <= 3; j++){
                System.out.print(number + ", ");
                number++;
            }
            System.out.print(number);
            number++;
            System.out.println();
        }
       
    }
}