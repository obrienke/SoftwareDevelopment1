public class Decisions {
    public static void main(String[] args) {
        int x  = 1;
        
        boolean result = (x == 2);

        String day = "Tuesday";
        if(day.equals("Tuesday")){
            System.out.println("It is Tuesday");
        }
        if(day.equals("Wednesday")){
            System.out.println("It is Wednesday");
        }
        if(day == "Tuesday"){
            System.out.println("It is Tuesday");
        }
        if(day == "Wednesday"){
            System.out.println("It is Wednesday");
        }
        if(result){
            System.out.println("x is equal to 1");
        }    

        if(x > 1){
            System.out.println("x is greater than 1");
            System.out.println("2nd line of code");
        }

        if(x >= 1){
            System.out.println("x is greater than or equal to 1");
        }

        if(x < 1){
            System.out.println("x is less than 1");
        }

        if(x <= 1){
            System.out.println("x is less than or equal to  1");
        }

        if(x != 1){
            System.out.println("x is not equal to  1");
        }        

        System.out.println("Program Ends");
    }
}
