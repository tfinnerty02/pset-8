import java.util.*;

public class Exercises {

	public static void main(String[] args) {
//		System.out.println(endsMeet(String[] values = {"1", "2", "3", "4", "5", "6"}, 2));
		System.out.println("p");

//		int[] h = {1, 2, 3, 4, 5, 6, 7, 8};
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
//		if (values == null || values.length < n || n < 0) {
//			values = new String[0];
//			return values;
//		} // work on other cases here
//
//		// write your code here
//		int stringLength = n * 2;
//		String[] firstLastN = new String[stringLength];
//		String[] firstN = Arrays.copyOfRange(values, 0, n - 1);
//		String[] lastN = Arrays.copyOfRange(values, values.length - 1 - n, values.length - 1);
//
//		System.arraycopy(firstN, 0, firstLastN, 0, n);
//		System.arraycopy(lastN, 0, firstLastN, n, n * 2);
//
//		return firstLastN;

		return null;

	}

	public int difference(int[] numbers) {
		// write your code here
		if (numbers == null || numbers.length < 1) {
			return -1;
		}
		int min = 0;
		int max = 0;

		if (numbers.length > 0) {
			min = numbers[0];

			for (int number : numbers) {
				if (number < min) {
					min = number;
				}
			}
		}

		if (numbers.length > 0) {
			max = numbers[0];

			for (int number : numbers) {
				if (number > max) {
					max = number;
				}
			}
		}

		return max - min;
	}

	public double biggest(double[] numbers) {
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
			return -1;
		}

		double max;
		double first = numbers[0];
		double middle = numbers[numbers.length / 2];
		double last = numbers[numbers.length - 1];

		double[] three = { first, middle, last };

		max = three[0];
		for (int i = 0; i < three.length; i++) {
			if (three[i] > max) {
				max = three[i];
			}
		}
		return max;
	}

	public String[] middle(String[] values) {
		if (values == null || Arrays.asList(values).contains(null) || values.length < 3 || values.length % 2 == 0) {
			return null;
		}

		int middle = values.length / 2;
		int start = middle - 1;
		int end = middle + 1;
		String[] newArray = Arrays.copyOfRange(values, start, end);

		return newArray;

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
