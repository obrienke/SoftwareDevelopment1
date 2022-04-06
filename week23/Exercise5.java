public class Exercise5{
  public static void main(String[] args){
    int[] x = {20, 30, 40, 50};
    int total = 0;
    double average = 0;
    int product = 1;

    for(int i = 0; i < x.length; i++){
        total += x[i];
        product *= x[i];
    }
    
    average = total / x.length;

    System.out.println("Index\tValue");
    System.out.println("-----\t-----");
    for(int i = 0; i < x.length; i++){
        System.out.println(i+"\t"+x[i]);
    }
    
    System.out.println();
    System.out.println("Total: "+total);
    System.out.println("Product: "+product);
    System.out.println("Average: "+average);
  }
}