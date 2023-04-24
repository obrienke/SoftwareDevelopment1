public class Lecture{
    public static void main(String[] args) {
       //declaring an instance of the method
        Lecture l = new Lecture(); 
       l.method1();//calling the method
       l.method2(10, "software development 1");
       int number1 = l.method3();
       int result = l.method4(3, 4);
       System.out.println(number1);
       System.out.println(result);
    }

    void method1(){
        System.out.println("method1");
    }
    void method2(int x, String y){
        System.out.println(x + " and " +y);
    }
    int method3(){
        return 100;
    }
    int method4(int x, int y){
        return x + y;
    }
}