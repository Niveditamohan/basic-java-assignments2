package com.training.multidimensionalarray.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.multidimensionalarray.MultiDimensionalArray;
import com.training.multidimensionalarray.exception.EmptyInputException;

public class TestMultiDimensionalArray {

	int matrix[][] = { { 6, 15, 12 }, { 13, 40, 25 }, { 16, 78, 68 } };
	
	/**
	 * Method to test searchElement() method of MultiDimensionalarray class for valid inputs
	 * @throws EmptyInputException
	 */
	@Test
	public void testSearchElementInMultiDimensionalArray() throws EmptyInputException {
		assertEquals(true, MultiDimensionalArray.searchElement(matrix, 40));
	}
	
	/**
	 * Method to test searchElement() method of MultiDimensionalarray class for invalid inputs
	 * @throws EmptyInputException
	 */
	@Test(expected = EmptyInputException.class)
	public void testSearchElementWhenMatrixIsEmpty() throws EmptyInputException {
		int[][] matrix = {};
		MultiDimensionalArray.searchElement(matrix, 100);
	}
}
