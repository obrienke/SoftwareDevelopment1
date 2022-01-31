public class TenthLoop{
  public static void main(String[] args){
    int counter = 0;

    System.out.println("Number\tSquare\tCube");

    while(counter <= 10){
      System.out.println(counter+"\t"+(counter*counter)+"\t"+(counter*counter*counter));
      counter = counter + 1;
    }
  }
}