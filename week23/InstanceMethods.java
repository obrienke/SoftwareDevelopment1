public class InstanceMethods {
    public static void main(String[] args) {
        InstanceMethods im = new InstanceMethods();
        im.method1(); 
        im.method2(1000);
        im.method3(100, 200);    
        im.method4("Kevin", "O'Brien");
        int number = im.method5();
        System.out.println("method5 returned the number: " + number);
        System.out.println(im.method6("Jane", "Smith")); //System.out.println("Jane Smith");
    }
    //e
    public String method6(String a, String b){
        return a + " " + b;
    }

    //d
    public void method4(String a, String b){
        System.out.println(a + " " + b);
    }
    //e
    public int method5(){
        return 50;
    }    
    //a
    public void method1(){
        System.out.println("Hello from method1");
    }
    //b
    public void method2(int x){
        System.out.println("method2 passed a value of "+x);
    }
    //c
    public void method3(int num1, int num2){
        System.out.println("method3 passed values of " + num2 + " and " + num1);
    }

}
