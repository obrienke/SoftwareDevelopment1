import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gross = 0;
        int qty;
        for(int i = 1; i <= 4; i++){
            System.out.print("Quantity sold of product " + i + ": ");
            qty = input.nextInt();
            if(i == 1){
                gross += qty * 239.99;
            }else if(i == 2){
                gross += qty * 129.75;    
            }else if(i == 3){
                gross += qty * 99.96;    
            }else{
                gross += qty * 350.89;
            }
        }
        System.out.println("Total earnings: " + Math.round(gross * 0.09 + 200));
        input.close();
    }
}
