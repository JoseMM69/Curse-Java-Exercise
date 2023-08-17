package ejercicios_arrays;

import java.util.ArrayList;
import java.util.List;

public class Factors {
	public List<Integer> determineAllFactors(int number) {
		if (number <= 0) {
			return new ArrayList<>();
		}

		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}
}
