/* 
 * Lab 1 - Debugging Exercise
 * 
 * name:
 * email:
 *
 * Fix all the bugs in this file! Then run it and add some extra test to make
 * sure everything works
 */
public class Debugging {
	

    public static double triArea(double b, double h) {
	    double area = b/2*h;
	    return area;
    }
	
    public static void main(String[] args) {
        System.out.printf("Running Debugging.java\n");
        double a = Debugging.triArea(5,3);
        System.out.printf("Area is: %f\n", a);
        System.out.println(triArea(10,3));
    }
}

