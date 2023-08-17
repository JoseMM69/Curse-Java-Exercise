package ejercicios_arrays;

public class LargestElement {
	public int findSecondLargestElement(int[] array) {
		// TODO: Write your code here

		if (array.length < 2) {
			return -1;
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int element : array) {
			// Comparison logic goes here.
			if (element > largest) {
				secondLargest = largest;
				largest = element;
			} else if (element > secondLargest && element != largest) {
				secondLargest = element;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			return -1;
		}
		return secondLargest;

	}
}
