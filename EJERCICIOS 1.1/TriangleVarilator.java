package com.fisrtjavaproject;

public class TriangleVarilator {
	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		// write your code here
		int t = angle1 + angle2 + angle3;
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		} else {
			return t == 180;
		}

	}
}
