public class Precision{
   public static void main(String[] args){
      double x = 44; 
      double y = 1.152; 
      double result; 
  
      result = x * y;   /*If using decimal instead of binary the result you would get is 50.688 
                          Java produces a different decimal value as it uses binary.*/
      System.out.println("With Java rounding rules the result is: "+result); 
      
      //To apply some precision to the result, you can round it to 2 decimal places
      result = Math.round(result * 100.0) / 100.0;
      System.out.println("Using Math.round method, can get a result to 2 decimal places: "+
                            Math.round(result * 100.0) / 100.0); 

      System.out.println("Round 12.3456 to 2 decimal places: "+Math.round(12.3456*100.0)/100.0);
      System.out.println("Round 12.3456 to 3 decimal places: "+Math.round(12.3456*1000.0)/1000.0);
      System.out.println("Round 12.3456999 to 4 decimal places: "+Math.round(12.3456999*10000.0)/10000.0);
   } // end method main
} // end class Precision

