package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double a, double b) throws IllegalArgumentException {
		if (b == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return a / b;
		}
	}

	String reverseString(String s) throws IllegalStateException {
		String temp = "";
		char[] arr = s.toCharArray();
		if (s.equals("")) {
			throw new IllegalStateException();
		} else {
			for (int i = arr.length - 1; i > 0; i--) {
				temp += arr[i];
			}
			return temp;
		}
	}
}
