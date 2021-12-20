import java.util.Scanner;
public class PopulationGrowthCalculator{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double currentPopulation; // today's world population
      double growthRate; // growth rate (1.14% would be .0114)
      double futurePopulation; // future population based on growth rate
      System.out.println();
      // obtain weight in pounds and height in inches
      System.out.println("Welcome to the world population calculator");
      System.out.print("Enter the current world population: ");
      currentPopulation = input.nextDouble();
      System.out.println("Enter the current growth rate");
      System.out.print("(e.g., 1.14% should be entered as .0114): ");
      growthRate = input.nextDouble();
      System.out.println();
      // calculate and display future population numbers
      futurePopulation = currentPopulation * (1 + growthRate);
      System.out.println("After 1 year, the world population will be " + Math.round(futurePopulation));

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.println("After 2 years, the world population will be " + Math.round(futurePopulation));

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.println("After 3 years, the world population will be " + Math.round(futurePopulation));

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.println("After 4 years, the world population will be " + Math.round(futurePopulation));

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.println("After 5 years, the world population will be " + Math.round(futurePopulation));
      System.out.println();
      input.close();
   } // end main
} // end class PopulationGrowthCalculator

