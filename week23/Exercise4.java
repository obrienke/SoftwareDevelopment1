import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);  
    char symbol;

    System.out.print("Enter a symbol: ");
    symbol = input.next().charAt(0);
    
    System.out.println();
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 5; j++){
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
    
    input.close();
  }
}