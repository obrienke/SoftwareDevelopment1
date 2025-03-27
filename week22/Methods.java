package week22;
public class Methods {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.hello();

        String s = m.greet();
        System.out.println(s);
        System.out.println(m.one());
        m.myPrinter("Giving my printer a go");
        m.numbers(200, 300, 400, "Kevin");
        System.out.println(m.add(3, 4));
    }

    void hello(){
        System.out.println("Hello there");
        System.out.println(greet());
    }

    String greet(){
        return "Good Evening to you";
    }

    int one(){
        return 1;
    }

    void myPrinter(String data){
        System.out.println(data);
    }

    void numbers(int first, int second, int third, String name){
        System.out.println(name + ": " + first + ", " + second + " and " + third);
    }

    int add(int x, int y){
        return x + y;
    }

}
