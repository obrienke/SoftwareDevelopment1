//Solving the class-average problem using counter controlled iteration
import java.util.Scanner; // program uses class Scanner

public class ClassAverage{
	public static void main(String[] args){
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);

		//initialization phase
		int total = 0; // initialize sum of grades entered by user
		int gradeCounter = 1; // initialize number of grade to be entered next
        int grade = 0;
        int average = 0;

		// processing phase uses counter-controlled iteration
		while(gradeCounter <= 10){ // loop 10 times
			System.out.print("Enter grade: "); //prompt
			grade = input.nextInt(); // input next grade
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter by 1
		}

		// termination phase
		average = total / 10; // integer division yields integer result

		// display total and average of grades
		System.out.println("\nTotal of all 10 grades is "+total);
        System.out.println("Class average is "+average);
        input.close();
	}
}

