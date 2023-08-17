package loops_java;

public class Factorial {
	public int calculateFactorial(int number) {
		// Write your code here
		if (number < 0) {
			return -1;
		}

		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}
}
