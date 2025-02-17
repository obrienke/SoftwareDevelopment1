public class Sum{
  public static void main(String[] args){
    int counter = 1;
    int sum = 0;
    int odd = 0;
    int even = 0;
    int diff = 0;

    while(counter <= 100){
      sum += counter;
      if(counter%2 == 0){
	      even += counter;
	    }else{
	      odd += counter;
	    }
      counter = counter + 1;
    }

    System.out.println("Sum of numbers 1 to 100 is: "+sum);
    System.out.println("Sum of even numbers 1 to 100 is: "+even);
    System.out.println("Sum of odd numbers 1 to 100 is: "+odd);
    
    if(odd>even){
	diff = odd - even;
    }else{
	diff = even - odd;
    }
    System.out.println("Difference between sum of even and odd numbers is: "+diff);
  }
}
