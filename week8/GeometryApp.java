import java.util.Scanner;
public class GeometryApp{
    public static void main(String[] args){
		System.out.println("Welcome to Geometry App!");
		System.out.println();
    	System.out.println("*********     ***             *             ***************");
    	System.out.println("*       *   *     *          * *            *             *");
    	System.out.println("*       *  *       *        *   *           *             *");
    	System.out.println("*       *  *       *       *     *          *             *");
    	System.out.println("*       *  *       *      *       *         *             *");
    	System.out.println("*       *  *       *     *         *        *             *");
    	System.out.println("*       *  *       *    *           *       *             *");
    	System.out.println("*       *   *     *    *             *      *             *");
    	System.out.println("*********     ***     *****************     ***************");
		System.out.println();
		System.out.println("Use this app to callculate the area of:");
		System.out.println("Rectangles, Circles, Triangles and Squares.");
		System.out.println();

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the rectangle: ");
		int l = input.nextInt();

		System.out.print("Enter the width of the rectangle: ");
		int w = input.nextInt();

		System.out.println();
		System.out.println("Area of rectangle is: "+(l * w));
		System.out.println();

		System.out.print("Enter the radius of the circle: ");
		double r = input.nextDouble();


		System.out.println();
		System.out.println("Area of circle is: "+(3.14 * r * r));
		System.out.println();

		System.out.print("Enter length and width of the square: ");
		int lw = input.nextInt();

		System.out.println();
		System.out.println("Area of square is: "+(lw * lw));
		System.out.println();

		System.out.print("Enter the length of the base of the triangle: ");
		int b = input.nextInt();

		System.out.print("Enter the height of the triangle: ");
		int h = input.nextInt();

		System.out.println();
		System.out.println("Area of triangle is: "+((h*b)/2));
		System.out.println();

		System.out.print("What is the unit of measurement for all these shapes? ");
		String unit = input.next();
		System.out.println("All area calculation results for areas of shapes are in "+unit+" squared.");
		System.out.println();
		input.close();
    }

}