public class Range {
    public static void main(String[] args) {
        int age = 20;

        if((age > 17) & (age < 35)){
            System.out.println("Your still young");
        }else{
            System.out.println("Your not young");
        }

        int val = 1;
        if((val == 1) || (val == 2)){
            System.out.println("1 or 2");
        }else{
            System.out.println("Not 1 or 2");
        }

        if(val > 10 & val < 20 || val == 100){
            System.out.println("Value is valid");
        }
    }
}
