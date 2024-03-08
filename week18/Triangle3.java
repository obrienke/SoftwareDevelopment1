public class Triangle3 {
    public static void main(String[] args) {
        System.out.println("Exercise 12:\n");
        for(int outer = 1; outer <= 10; outer++){
            for(int inner = 1; inner < outer; inner++){
                System.out.print(" ");
            }
            for(int inner = 10; inner >= outer; inner--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

 * 
 **
 *** 

  *
 ***
*****
 */
