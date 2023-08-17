package Funcional_Java_Programming;

import java.util.List;

public class SumaSquare {
	public static long sumOfSquares(List<Integer> numbers) {
		if (numbers == null) {
			return 0;
		}

		return numbers.stream().mapToLong(number -> number * number).sum();
	}
}
