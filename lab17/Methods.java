public class Methods {
    public static void main(String[] args) {
        //System.out.println(args[0] + " " + args[1]);
        method1();
        Methods m = new Methods();
        m.method2();
        m.method3(300);
        m.method4(32, "Tom", 3.4);
        int y = m.method5(10);
        System.out.println(y);
    }
    // static method which returns nothing
    public static void method1(){ 
        System.out.println("Method 1");
    }
    // instance method which returns nothing
    void method2(){
        System.out.println("Method 2");
    }
    void method3(int x){
        System.out.println("Method 3: " + x);
    }
    void method4(int x, String name, double y){
        System.out.println("Method 4: " + x + " and " + name + " and " + y);
    }
    int method5(int x){
        x = x + 2;
        return x;
    }

}
