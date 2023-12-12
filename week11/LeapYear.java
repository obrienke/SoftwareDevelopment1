import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int days = 0;
        String monthName = "";
        boolean valid = true; 

        System.out.print("Enter a year: ");
        year = input.nextInt();
        System.out.print("Enter a month: ");
        month = input.nextInt();

        if(month >= 1 && month <= 12){
            switch(month){
                case 1:
                    monthName = "January";
                    days = 31;
                    break;
                case 2:
                    monthName = "February";
                    if(year % 4 == 0){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
                case 3:
                    monthName = "March";
                    days = 31;
                    break;
                // etc ...
            }
        }else{
            System.out.println("Invalid month");
            valid = false;
        }
        if(valid){
            System.out.println(monthName + " in " + year + " has " + days + " days.");
        }
        
        // rewrite just using a switch, but include a default. 
        switch(month){
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if(year % 4 == 0){
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            // etc ...
            default:
                System.out.println("Invalid month");
                valid = false;
        }
        if(valid){
            System.out.println(monthName + " in " + year + " has " + days + " days.");
        }

        // another way, just for setting days.
        if(month == 9 || month == 4 || month == 6 || month == 11){
            days = 30;
        }else if(month == 2){
            if(year % 4 == 0){
                days = 29;
            }else{
                days = 28;
            }
        }else{
            days = 31;
        }
        // conclude - by working out monthName from month value.
        
        input.close();
    }
}