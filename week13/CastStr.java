
public class CastStr{
    public static void main(String[] args){
        System.out.println("a: "+(int) 'a');
        System.out.println("A: "+(int) 'A');
        System.out.println("space: "+(int) ' ');
		System.out.println("a cast to double: "+(double) 'a');

        char a = (char) 65;
        System.out.println("65: "+a);

        System.out.println("2 + 2.0 = "+(2 + 2.0));
        /*
        In this expression 2 is an integer and it is promoted to a double 2.0
        integer(32 bit) promoted to double(64 bit).
        If a double is demoted to an integer and the double is of a value
        greater than the range for integer (2147483647), then the double
        number will be reduced to the maximum value allowed for an integer
        */
        double num = 2147483648.0;
        System.out.println("Double number: 2147483648.0");
        System.out.println("Double cast to int: "+ (int) num);
        System.out.println("Maximum int value:  "+Integer.MAX_VALUE);
    } // end of main method
} // end of class



