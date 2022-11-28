public class Levels {
    public static void main(String[] args) {
        int number = 12;

        switch(number){
            case 1: 
                System.out.println("Level 1");
                break;
            case 2:
                System.out.println("Level 2");
                break;
            case 3:
                System.out.println("Level 3");
                break;
            case 4:
                System.out.println("Level 4");
                break;
            case 5:
                System.out.println("Level 5");
                break;
            default:
                System.out.println("Default");
        }

        String name = "Kevin";
        switch(name){
            case "Kevin": 
                System.out.println("Kevin");
                break;
            case "Tom":
                System.out.println("Tom");
                break;  
            default:
                System.out.print("Not Tom or Kevin");
        }
    }
}