package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double a, double b) throws IllegalArgumentException {
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
}
