public class Square {
    public static void main(String[] args) {
        System.out.println("Number\tSquare");
        System.out.println("++++++\t++++++");
        for(int i = 2; i <= 7; i++){
            System.out.println(i + "\t" + sqaureOf(i));
        }
    }

    static int sqaureOf(int value){
        return value * value;
    }
}
