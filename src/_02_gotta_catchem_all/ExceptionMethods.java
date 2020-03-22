package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double a, double b) throws IllegalArgumentException {
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	public static String reverseString(String a) {
		a = a.toLowerCase();
		char[] b = a.toCharArray();
		String c = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			c += b[i];
		}
		return c;
	}
}
