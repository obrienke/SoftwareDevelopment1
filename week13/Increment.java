//Prefix increment and postfix increment operators

public class Increment{
  public static void main(String[] args){
    int number = 10;

    System.out.println("Number before post increment: "+number);
    System.out.println("Post increment number: "+(number++));
    System.out.println("Number after post increment: "+number);

    System.out.println(); // skip a line

    number = 10; // reset number to 10
    System.out.println("Number before pre increment: "+number);
    System.out.println("Pre increment number: "+(++number));
    System.out.println("Number after pre increment: "+number);

    System.out.println(); // skip a line
  }
}




