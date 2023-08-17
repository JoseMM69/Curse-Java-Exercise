package com.fisrtjavaproject;

public class TimeConverter {
	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method
		if (hours < 0) {
			return -1;
		} else {
			int result = hours * 60;
			return result;
		}

	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		if (days < 0) {
			return -1;
		} else {
			int result2 = days * 24 * 60;
			return result2;
		}

	}
}
