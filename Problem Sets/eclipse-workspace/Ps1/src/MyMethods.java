
public class MyMethods {
	
	/*
	 * printDecreasing - takes a string s as a parameter and
	 * print decreasing substrings of the original string
	 */
	public static void printDecreasing(String s) {
		for (int i = s.length(); i >= 0; i--) {
			System.out.println(s.substring(0,i));
		}
	}
	
	/*
	 * firstAndLast - takes a string str as its parameter and
	 * returns a new string formed by combining the first and
	 * last characters of str
	 */
	public static String firstAndLast(String str) {
		String newStr = "";
		if (str.length() == 1) {
			newStr = str;
			return newStr;
		}
		else {
			newStr = str.substring(0,1) + str.substring(str.length()-1);
			return newStr;
		}
	}
	
	/*
	 * lastIndexOf - takes two parameters: a string str and a character ch and
	 * returns the index of the last occurence of ch in str
	 */
	public static int lastIndexOf(String str, char ch) {
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * repeat - takes two parameters: a string str and an integer n and
	 * returns a new string consisting of n copies of str
	 */
	public static String repeat(String str, int n) {
		String result = "";
		for(int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}

}
