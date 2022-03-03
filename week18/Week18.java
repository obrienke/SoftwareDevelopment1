import java.util.Scanner;
public class Week18 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //sentinel loop example using break.
    int flag = 0;
    while(true){
        System.out.print("Enter -1 to quit: ");
        flag = input.nextInt();
        if(flag == -1){
            break;
        }
        System.out.println("In the loop");
    }

    //nested loop example.
    int output = 0;
    for(int outer = 1; outer <= 3; outer++){
        for(int inner = 1; inner <= 4; inner++){
            System.out.print(++output + "\t");    
        }
        System.out.println();
    }
   } 
}
