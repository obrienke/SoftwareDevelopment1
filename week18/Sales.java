import java.util.Scanner;
public class Sales{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberSold = 0;
        double sales = 0;

        for(int product = 1; product <= 4; product++){
            System.out.print("Number of items sold, product " + product + ": ");
            numberSold = input.nextInt();
            if(product == 1){
                sales += 239.99 * numberSold;
            }else if(product == 2){
                sales += 129.75 * numberSold;
            }else if(product == 3){
                sales += 99.96 * numberSold;
            }else{
                sales += 350.89 * numberSold;
            }
        }
        System.out.println("\nEarnings for week are: " + Math.round(sales * 0.09 + 200));
        input.close();
    }
}