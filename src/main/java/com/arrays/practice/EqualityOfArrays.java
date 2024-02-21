package com.arrays.practice;

public class EqualityOfArrays {
	public boolean areTheyArraysAreEqual(int[] arrayOne, int[] arrayTwo) {
		boolean value = true;
		if (arrayOne.length != arrayTwo.length) {
			value = false;
		} else {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					value = false;
					break;
				}
			}
		}
		return value;
	}
}
