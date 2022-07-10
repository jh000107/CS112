/*
 * Problem Set 1
 *
 * Practice with static methods, part I
 *
 * Note: Because this class is simply a collection of static methods 
 * and it does not have a main method, you cannot run it.
 * See the problem set for instructions about how to test the methods 
 * that you write.
 */

public class Methods {
    /*
     * printVertical - takes a string s and prints the characters of 
     * the string vertically -- with one character per line.
     */
    public static void printVertical(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
    
    /*
     * printWithSpaces - takes a string s and prints the characters of the string
     * separated by spaces
     */
    public static void printWithSpaces(String s) {
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		System.out.print(c + " ");
    	}
    }
    
    /*
     * middleChar - takes a String object as a parameter(s) and
     * returns the character in the "middle" of the string
     */
    public static char middleChar(String s) {
    	int midIndex = (s.length()-1)/2;
    	return s.charAt(midIndex);
    }
    
    /*
     * moveToEnd - takes two parameters: a string str and an index i and
     * returns a new string created by "moving" the first
     * i characters of str to the end of the string, after
     * the other characters in str 
     */
    public static String moveToEnd(String str, int i) {
    	if (str.length() <= i) {
    		return str;
    	}
    	else {
    		String newStr = str.substring(i) + str.substring(0, i);
    		return newStr;
    	}
    }
    
}