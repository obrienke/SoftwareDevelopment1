public class Squares {
    public static void main(String[] args) {
        int i = 1, max = 10, total = 0;
        String div = "--------------";
        System.out.println(div);
        System.out.println("Number\tSquare");
        System.out.println(div);
        while(i <= max){
            System.out.println(i + "\t" + (i * i));
            total = total + (i * i);
            i++;
        }
        System.out.println(div);
        System.out.println("Total\t" + total);
        System.out.println(div);
        System.out.println();
        System.out.println(div);
        System.out.println("Number\tSquare");
        System.out.println(div);
        total = 0;
        for(int x = 1; x <= max; x++){
            System.out.println(x + "\t" + (x * x));
            total = total + (x * x);
        }
        System.out.println(div);
        System.out.println("Total\t" + total);
        System.out.println(div);
    }
}
