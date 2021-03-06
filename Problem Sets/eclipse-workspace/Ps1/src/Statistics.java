
	/*
	 * Problem Set 1
	 *
	 * File: Statistics.java
	 * Author: Junhui Cho
	 * Course: CS112, Boston University
	 * Section: B1
	 *
	 * Purpose: Template code - Alter to state the purpose of this program
	 */

	// The following import command is required for performing user input:
	// The Scanner class is a library which provides functionality for
	// reading input from the user in the Interactions Pane. Some
	// libraries (such as Math) are already inported, but most (such
	// as Scanner) you need to explicitly import. The import statement
	// must occur before your class definition. 

	import java.util.Scanner;
	public class Statistics { 
	    
	    /* 
	     * main method of the Statistics program which will
	     * be used as the main entry point of our program and 
	     * to test the methods of the class.
	     */
	    public static void main(String[] args) {

	        // Enter your code
	    	Scanner i = new Scanner(System.in);
	    	System.out.println("Enter the first number: ");
	    	int num1 = i.nextInt();
	    	System.out.println("Enter the second number: ");
	    	int num2 = i.nextInt();
	    	System.out.println("Enter the third number: ");
	    	int num3 = i.nextInt();
	    	
	    	display_statistics(num1, num2, num3);
	        
	    }
	    
	    /*
	     * display_statistics()
	     *
	     * Static method of this class which will be used to calulate and
	     * display the required statistics.
	     *
	     * This method accepts three integer arguments as input values and uses
	     * the input values to compute the statistics. This method is a void 
	     * method and does not return any value.
	     */ 
	    public static void display_statistics( int num1, int num2, int num3 ) {

	        // computation for sum
	    	int sum = num1 + num2 + num3;
	    	System.out.println("The sum of the three numbers is " + sum);
	    	
	    	// computation for max
	    	int max = Math.max(Math.max(num1, num2), num3);
	    	System.out.println("The maximum of the three numbers is " + max);
	    	
	    	// computation for min
	    	int min = Math.min(Math.min(num1, num2), num3);
	    	// computation for range
	    	int range = max - min;
	    	System.out.println("The range of the numbers is " + range);
	    	
	    	// computation for mean
	    	double mean = sum / 3;
	    	System.out.print("The mean of the three numbers is ");
	    	System.out.printf("%.4f%n", mean);
	    	
	    	// computation for standard deviation
	    	double sd = Math.pow(num1-mean, 2) + Math.pow(num2-mean, 2) +
	    			Math.pow(num3-mean, 2);
	    	sd = Math.sqrt(sd/3);
	    	System.out.print("The standard deviation of the three numbers is ");
	    	System.out.printf("%.4f%n", sd);
	    	
	    	System.out.println(min);
	    	System.out.println(sum - max - min);
	    	System.out.println(max);

	    }
	}
