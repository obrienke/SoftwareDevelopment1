import java.util.Scanner;
public class RunnersApp{
  public static void main(String[] args){
	System.out.println();  
	System.out.println("Welcome to runners app");
	System.out.println();
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of hours first: ");
	int hours = input.nextInt();
	System.out.print("Enter number of minutes next: ");
	int minutes = input.nextInt();
	System.out.print("Finally enter the number of miles you ran: ");
	double distance = input.nextDouble();

	System.out.println();
	System.out.println("You ran " + distance + " miles in " + hours + " hours and " + minutes + " minutes.");
	System.out.println("Well done you!!!");
	System.out.println();

	double speed = ((hours*60)+minutes)/distance;
	System.out.println("Your pace is: " + (Math.round(speed*100.0)/100.0) + " minutes per mile.");

	//part 2: Estimate marathon time and half marathon time based on pace
	double mar_mins = (speed * 26.2);
	double half_mins = (speed * 13.1);
	System.out.println();
	System.out.println("A half marathon would take you: " + (Math.round(half_mins*100.0)/100.0) + " minutes.");
	System.out.println("A marathon would take you: " + (Math.round(mar_mins*100.0)/100.0) + " minutes.");
	System.out.println();

	//In hours and minutes
	String hr = "hours";
	if(Math.round(half_mins)/60 == 1){
		hr = "hour";
	}
	String min = "minutes";
	if(Math.round(half_mins)%60 == 1){
		min = "minute";
	}	
	System.out.println("A half marathon would take you: " + (Math.round(half_mins)/60) + " " + hr +
						" and " + (Math.round(half_mins)%60) + " " + min + ".");
	hr = "hours";
	if(Math.round(mar_mins)/60 == 1){
		hr = "hour";
	}
	min = "minutes";
	if(Math.round(mar_mins)%60 == 1){
		min = "minute";
	}	
	System.out.println("A marathon would take you: " + (Math.round(mar_mins)/60) + " " + hr +
						" and " + (Math.round(mar_mins)%60) + " " + min + ".");
						
	System.out.println();
	input.close();
  }//end of main method
}//end of class
