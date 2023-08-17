package ejercicios_arrays;

public class SumArrays {
	private int[] array1;
	private int[] array2;

	public SumArrays(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		return sum1 == sum2;

	}

	private int calculateSum(int[] array) {

		// TODO: Write the code to calculate the sum of the array.
		int sum = 0;
		for (int element : array) {
			sum += element;
		}
		return sum;
	}
}
