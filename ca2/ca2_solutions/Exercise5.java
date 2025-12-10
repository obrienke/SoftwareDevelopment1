import java.util.Scanner;

public class Exercise5{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int first = 0, second = 0, third = 0, fourth = 0, fifth = 0, sixth = 0, seventh = 0, eight = 0;
      int pos = 0, neg = 0, zero = 0;

      System.out.print("Enter first number: "); // prompt for input
      first = input.nextInt();
      if(first > 0){
        pos = pos + 1;
      }else if(first < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }

      System.out.print("Enter second number: "); // prompt for input
      second = input.nextInt();
      if(second > 0){
        pos = pos + 1;
      }else if(second < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }

      System.out.print("Enter third number: "); // prompt for input
      third = input.nextInt();
      if(third > 0){
        pos = pos + 1;
      }else if(third < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }

      System.out.print("Enter fourth number: "); // prompt for input
      fourth = input.nextInt();
      if(fourth > 0){
        pos = pos + 1;
      }else if(fourth < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }

      System.out.print("Enter fifth number: "); // prompt for input
      fifth = input.nextInt();
      if(fifth > 0){
        pos = pos + 1;
      }else if(fifth < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }

      System.out.print("Enter sixth number: "); // prompt for input
      sixth = input.nextInt();
      if(sixth > 0){
        pos = pos + 1;
      }else if(sixth < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }

      System.out.print("Enter seventh number: "); // prompt for input
      seventh = input.nextInt();
      if(seventh > 0){
        pos = pos + 1;
      }else if(seventh < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }


      System.out.print("Enter eight number: "); // prompt for input
      eight = input.nextInt();
      if(eight > 0){
        pos = pos + 1;
      }else if(eight < 0){
        neg = neg + 1;
      }else{
        zero = zero + 1;
      }
      
      System.out.println("\nTotal positive numbers entered: "+pos);
      System.out.println("Total negative numbers entered: "+neg);
      System.out.println("Total zero values entered: "+zero);
      input.close();
   } // end main
} // end class
