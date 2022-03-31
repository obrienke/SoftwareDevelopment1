
import java.util.Scanner;

public class SearchStudent{
  public static void main(String[] args){
    String[][] students = {
      { "Mary Reilly", "Software Development", "Year 1", "GMIT"},
      { "Garrett Winters", "Business Studies", "Year 3", "AIT"},
      { "Ashley Cox", "Chemistry", "Year 3", "NUIG" },
      { "Joe Kelly", "Computing and Digital Media", "Year 2", "GMIT" }
    };

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a search value: ");
    String searchStr = input.nextLine();
    int match = 0;

    System.out.println();
    for(int i = 0; i < students.length; i++){
	    for(int j = 0; j < students[i].length; j++){
	      if(searchStr.equals(students[i][j])){
		    match++;
		    if(match == 1){
		      System.out.println("Name\t\tCollege");
		    }
		    System.out.println(students[i][0]+"\t"+students[i][3]);
		  }
	  }
	}
	System.out.println();
	System.out.println("Records with match: "+match);
  }
}