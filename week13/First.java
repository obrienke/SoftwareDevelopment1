public class First{
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Value of x is: " + x);

        // compound assignment
        x += 5; // x = x + 5
        System.out.println("Value of x is now: " + x);
        x -= 5; // x = x - 5
        System.out.println("Value of x is now: " + x);
        x *= 2; // x = x * 2
        System.out.println("Value of x is now: " + x);
        x /= 2; // x = x / 2
        System.out.println("Value of x is now: " + x);

        // incrementor
        x++; // post incrementor
        System.out.println("Value of x is now: " + x);
        ++x; // pre incrementor
        System.out.println("Value of x is now: " + x);
        System.out.println("Value of x is now: " + x++);
        System.out.println("Value of x is now: " + x);
        System.out.println("Value of x is now: " + ++x);

        // decrementor
        x--; // post decrementor
        System.out.println("Value of x is now: " + x);
        --x; // pre decrementor
        System.out.println("Value of x is now: " + x);
        System.out.println("Value of x is now: " + x--);
        System.out.println("Value of x is now: " + x);
        System.out.println("Value of x is now: " + --x);

        String name = "Kevin";
        boolean isEqual = name.equals("Kevin");
        //System.out.println("Names match: " + isEqual);
        if(isEqual){
            System.out.println("Names match");
        }else{
            System.out.println("Names do not match");
        }
    }
}