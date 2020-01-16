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
		String[] resultArray = new String[n * 2];
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
		return false;
	}

	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}

		ArrayList<Integer> evenIndexes = new ArrayList<Integer>();
		ArrayList<Integer> oddIndexes = new ArrayList<Integer>();

		int countXEven = 0;
		int countXOdd = 0;
		for (int i = 0; i < numbers.length; i+= 2) {
			evenIndexes.add(numbers[i]);
		}
		for (int i = 1; i < numbers.length; i+= 2) {
			oddIndexes.add(numbers[i]);
		}
		for (int j = 0; j < evenIndexes.size() - 1; j++) {
			if (evenIndexes.get(j).equals(x)) {
				countXEven++;
			}
		}
		for (int k = 0; k < oddIndexes.size() - 1; k++) {
			if (oddIndexes.get(k).equals(x)) {
				countXOdd++;
			}
		}
		if (countXEven == evenIndexes.size() || countXOdd == oddIndexes.size()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean consecutive(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		int j;
		int k;
		for (int i = 0; i < numbers.length - 2; i++) {
			j = i + 1;
			k = i + 2;
			if ((numbers[i] % 2 == 0 && numbers[j] % 2 == 0 && numbers[k] % 2 == 0)
					|| (numbers[i] % 2 == 1 && numbers[j] % 2 == 1 && numbers[k] % 2 == 1)) {
				return true;
			}
		}

		return false;
	}

	public boolean balance(int[] numbers) {
		if (numbers == null || numbers.length < 2) {
			return false;
		}

		for (int i = 0; i < numbers.length; i++) {
			int firstHalf = 0;
			int secondHalf = 0;
			for (int j = 0; j < i; j++) {
				firstHalf += numbers[j];
			}
			for (int k = i; k < numbers.length; k++) {
				secondHalf += numbers[k];
			}
			if (firstHalf == secondHalf) {
				return true;
			}
		}

		return false;
	}

	public int clumps(String[] values) {
		try {
			List<String> list = Arrays.asList(values);
		} catch (NullPointerException e) {
			return -1;
		}
		if (values == null) {
			return -1;
		}

		boolean clumps = false;
		int count = 0;
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i].equals(values[i + 1]) && !clumps) {
				clumps = true;
				count++;
			} else if (!values[i].equals(values[i + 1])) {
				clumps = false;
			}
		}

		return count;
	}
}
