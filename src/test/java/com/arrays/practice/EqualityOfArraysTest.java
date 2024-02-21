package com.arrays.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EqualityOfArraysTest {

	private EqualityOfArrays eoa;

	@Before
	public void setUp() {
		eoa = new EqualityOfArrays();
	}

	@Test
	public void testCaseForAreTheseTwoArraysSame1() {
		int[] arrayOne = { 2, 5, 7, 9, 10 };
		int[] arrayTwo = { 2, 5, 7 };
		boolean result = eoa.areTheyArraysAreEqual(arrayOne, arrayTwo);
		org.junit.Assert.assertFalse(result);
	}

	@Test
	public void testCaseForAreTheseTwoArraysSame2() {
		int[] arrayOne = { 2, 5, 7 };
		int[] arrayTwo = { 2, 5, 7 };
		boolean result = eoa.areTheyArraysAreEqual(arrayOne, arrayTwo);
		Assert.assertTrue(result);
	}

	@Test
	public void testCaseForAreTheseTwoArraysSame3() {
		int[] arrayOne = { 2, 5, 7 };
		int[] arrayTwo = { 2, 5, 8 };
		boolean result = eoa.areTheyArraysAreEqual(arrayOne, arrayTwo);
		Assert.assertFalse(result);
	}

}
