public class lab8_demo{
    public static void main(String[] args){
        int grade = 62;
        int level = 0;
        int age = 20;
        boolean hasID = false;
        boolean isWeekend = false, isHolidays = true;

        if(age >= 18 && hasID){
            System.out.println("You may enter");
        }else{
            System.out.println("You may not enter");
        }
        if(isWeekend || isHolidays){
            System.out.println("Relax");
        }else{
            System.out.println("Keep working. Your time to relax is just around the corner");
        }
        if((age >= 18 && hasID) || isHolidays){
            System.out.println("and and or together evaluating to true");
        }else{
            System.out.println("and and or together evaluating to false");
        }


        if(grade >= 70){
            System.out.println("First class honours");
            level = 1;
        }else if(grade >= 60){
            System.out.println("Second class honours higher");
            level = 2;
        }else if(grade >= 50){
            System.out.println("Second class honours lower");
            level = 3;
        }else if(grade >= 40){
            System.out.println("Pass");
            level = 4;
        }else{
            System.out.println("Fail");
        }

        switch(level){
            case 1:
                System.out.println("1.1");
                break;
            case 2:
                System.out.println("2.1");
                break;
            case 3:
                System.out.println("2.2");
                break;
            case 4:
                System.out.println("3");
                break;
            default:
                System.out.println("F");
        }


    }
}