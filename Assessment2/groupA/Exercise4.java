import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mm = 0, year = 0, days = 31;
        boolean leap = false;
        String month = "";

        System.out.print("Enter a number for month: ");
        mm = input.nextInt();
        System.out.print("Enter a number for year: ");
        year = input.nextInt();
        if(mm < 1 || mm > 12){
            System.out.println("\nInvalid number for month was entered. Must be a value from 1 to 12.");
        }else{
            //check if a leap year
            if(year % 4 == 0){
                leap = true;
            }
            if(mm == 1){
                month = "January";
            }else if(mm == 2){
                month = "February";
                if(leap){
                    days = 29;
                }else{
                    days = 28;
                }
            }else if(mm == 3){
                month = "March";
            }else if(mm == 4){
                month = "April";
                days = 30;
            }else if(mm == 5){
                month = "May";
            }else if(mm == 6){
                month = "June";
                days= 30;
            }else if(mm == 7){
                month = "July";
            }else if(mm == 8){
                month = "August";
            }else if(mm == 9){
                month = "September";
                days = 30;
            }else if(mm == 10){
                month = "October";
            }else if(mm == 11){
                month = "November";
                days = 30;
            }else{
                month = "December";
            }
            System.out.println("\nNumber of days in " + month + " is " + days);
        }
        input.close();
    }
}