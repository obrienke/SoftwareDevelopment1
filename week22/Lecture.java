public class Lecture{
    public static void main(String[] args) {
        //System.out.println("First argument " + args[0]);
        //System.out.println("Second argument " + args[1]);
        Lecture l = new Lecture();
        l.method1();
        l.method2(10);
        l.method2(20);
        l.method3(1, "Monday");
        System.out.println(l.method4("Kevin","O'Brien"));

    }

    public void method1(){
        System.out.println("Method 1");
    }

    void method2(int x){
        System.out.println("Value passed to method2 is " + x);
    }

    void method3(int x, String y){
        System.out.println("Values passed to method3 are " + x + " and " + y);
    }

    String method4(String x, String y){
        String z = x + " " + y;
        return z;
    }
}