public class Methods{
    public int doSomething(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        Methods m = new Methods();
        m.printSomething();
        m.printSomething();
        m.printSomethingElse(10, "Kevin");    
        int number = m.returnsNumber();
        System.out.println(number);
        System.out.println(m.doSomething(3, 4));
    }

    public void printSomething(){
        System.out.println("This method prints something");
    }
    public void printSomethingElse(int x, String name){
        System.out.println(x + " " + name);
    }
    public int returnsNumber(){
        return 1000;
    }



}