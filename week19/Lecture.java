import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = 0;
        for(;;){ // no initialiser, condition, incrementor
            System.out.print("loop again: (0 for yes): ");
            x = kb.nextInt();
            if(x == 0){
                continue;   
            }else{
                System.out.println("did not contine");
                break;
            } 
        }
        kb.close();
    }
}
