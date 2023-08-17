package com.fisrtjavaproject;

public class TrinagleValidator {
	public boolean isRightAngled(int side1, int side2, int side3) {
		// write your code
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return false;
		}
		if (side1 * side1 + side2 * side2 == side3 * side3) {
			return true;
		}
		if (side2 * side2 + side3 * side3 == side1 * side1) {
			return true;
		}
		if (side3 * side3 + side1 * side1 == side2 * side2) {
			return true;
		}

		return false;
	}
}
