/*

**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *

*/

public class Triangle2 {
    public static void main(String[] args) {
        int rows = 10, columns = 1, spaces = 10;
        while(rows >= 1){
            while(spaces > rows){
                System.out.print(" ");
                spaces--;
            }
            spaces = 10;
            while(columns <= rows){
                System.out.print("*");
                columns++;
            }
            columns = 1;
            System.out.println();
            rows--;
        }
    }
}
