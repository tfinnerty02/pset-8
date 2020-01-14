import java.util.*;

public class Exercises {

	public static void main(String[] args) {
//		System.out.println(endsMeet(String[] values = {"1", "2", "3", "4", "5", "6"}, 2));
		System.out.println("p");
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		// write your code here
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}

		return false;
	}

	public String[] endsMeet(String[] values, int n) {
//		if (values == null) {
//			values = new String[0];
//			return values;
//		} // work on other cases here
//
//		// write your code here
//		String[] firstLastN = new String[n * 2];
//		String[] firstN = Arrays.copyOfRange(values, 0, n - 1);
//		String[] lastN = Arrays.copyOfRange(values, values.length - 1 - n, values.length - 1);
//
//		System.arraycopy(firstN, 0, firstLastN, 0, n);
//		System.arraycopy(lastN, 0, firstLastN, n, n * 2);
//
//		return firstLastN;

	}

	public int difference(int[] numbers) {
		// write your code here

		return -1; // default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
		// write your code here

		return -1; // default return value to ensure compilation
	}

	public String[] middle(String[] values) {
		// write your code here

		return null; // default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public int clumps(String[] values) {
		// write your code here

		return -1; // default return value to ensure compilation
	}
}
