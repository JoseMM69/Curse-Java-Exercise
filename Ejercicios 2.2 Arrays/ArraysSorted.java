package ejercicios_arrays;

public class ArraysSorted {
	public boolean isSorted(int[] array) {
		if (array.length <= 1) {
			return true;
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i]) {
				return false;
			}
		}
		return true;
	}
}
