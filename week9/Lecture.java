/* 
Code demonstrated during week 9 online lecture
*/

public class Lecture{
	public static void main(String[] args){		
    int x = 4;

    //double selection
    if(x == 5){
      System.out.println("Number is equal to 5");
    }else{
      System.out.println("Number is NOT equal to 5");
    }

    int number = 1;

    //nested if statement
    if(number > 0){
      System.out.println("Number is positive");
    }else{
      if(number < 0){
        System.out.println("Number is negative");
      }else{
        System.out.println("Number is zero");
      }
    }

    //cascading if/else
    if(number > 0){
      System.out.println("Number is positive");
    }else if(number < 0){
      System.out.println("Number is negative");
    }else{
      System.out.println("Number is zero");
    }

    //swtich statement
    switch(number){
      case 1:
        System.out.println("Number is 1");
        break;
      case 2:
        System.out.println("Number is 2");
        break;
      default:
        System.out.println("Number is not 1 or 2");
    }

    //logical and
    int age = 33;
    String gender = "male";

    if(age >= 18 && age <= 35){
      System.out.println("Age is between 18 and 35");
    }

    if(age >= 18 && age <= 35 && gender == "male"){
      System.out.println("Age is between 18 and 35 and gender is male");
    }

    //logical and - multiply the binary results
    /*1 * 1 = 1;
    1 * 0 = 0;
    */

    //logical or 
    if(number == 1 || number == 2){
      System.out.println("Number is 1 or 2");
    }

    //logical or - add the binary results
    /*1 + 0 = 1;
    0 + 1 = 1;
    1 + 1 = 1;
    0 + 0 = 0;*/

    //logical and, logical or example
    if((number == 1 || number == 2) && gender == "male" ){
      System.out.println("Number is 1 or 2 and gender is male");
    }

	}
}