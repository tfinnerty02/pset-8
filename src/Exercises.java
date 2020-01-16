import java.util.*;


public class Exercises {

	public static void main(String[] args) {
		System.out.println("p");
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}

		return false;
	}

	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n < 1) {
            return new String[0];
        }
		
		String[] firstN = Arrays.copyOfRange(values, 0, n);
		String[] lastN = Arrays.copyOfRange(values, values.length - n, values.length);
		String[] resultArray = new String[n*2];
		System.arraycopy(firstN, 0, resultArray, 0, n);  
		System.arraycopy(lastN, 0, resultArray, n, n);  
		
		return resultArray;
	}

	public int difference(int[] numbers) {
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
			values = new String[0];
			return values;
		}

		int middle = values.length / 2;
		int start = middle - 1;
		int end = middle + 1;
		String[] newArray = Arrays.copyOfRange(values, start, end);

		return newArray;

	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		for (int i = 0; i < numbers.length; i += 3) {
			if (numbers[i] < numbers[i + 1] && numbers[i + 1] <= numbers[i + 2]) {
				return true;
			}
		}
		return false; // default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}

		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				count++;
			}
		}

		if (count == numbers.length / 2 || count == (numbers.length + 1) / 2 || count == numbers.length) {
			return true;
		}

		return false;

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
