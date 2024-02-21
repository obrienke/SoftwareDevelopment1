import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;  
        int qty = 0;

        for(int i = 1; i <= 4; i++){
            System.out.print("Enter number of item " + i + " sold: ");
            qty = input.nextInt();
            if(i == 1){
                total = total + (qty * 239.99);
            }else if(i == 2){
                total = total + (qty * 129.75);
            }else if(i == 3){
                total = total + (qty * 99.96);
            }else{
                total = total + (qty * 350.89); 
            }
        }
        total = total * 0.09;
        System.out.println("Earnings for week: " + Math.round(total + 200));
        input.close();
    }
}
