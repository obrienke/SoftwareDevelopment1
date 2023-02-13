public class TwentyNums{
   public static void main(String[] args){
	 int i = 1;
	 while (i <= 20) {
	    System.out.print(i + " ");
	    i++;
      }

	 System.out.println();

     i = 1;
	 while (i <= 20) {
	    System.out.print(i);
	    if (i < 20){
		  System.out.print(" + ");
	    }
	    i++;
      }
      System.out.println();

	} // end main
} // end class
