package com.training.missingnumber.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.missingnumber.MissingNumberFinder;
import com.training.missingnumber.exception.EmptyArrayException;
import com.training.missingnumber.exception.NoMissingNumberFoundException;

public class TestMissingNumber {

	/**
	 * Method to test find method of MissingNumberFinder class with proper input
	 * 
	 * @throws NoMissingNumberFoundException
	 * @throws EmptyArrayException
	 */
	@Test
	public void testMissingNumberInAnArray() throws NoMissingNumberFoundException, EmptyArrayException {
		int[] input = {9,8,7,6,5,4,2};
		assertEquals(3, MissingNumberFinder.find(input));
	}
	
	/**
	 * Method to test find method of MissingNumberFinder class with no missing number input
	 * 
	 * @throws NoMissingNumberFoundException
	 * @throws EmptyArrayException
	 */
	@Test(expected = NoMissingNumberFoundException.class)
	public void testMissingNumberInAnArrayWithNoMissingNumberThrowsException() throws NoMissingNumberFoundException, EmptyArrayException {
		int[] input = {9,8,7,6,5,4,3,2,1};
		MissingNumberFinder.find(input);
	}
	
	
	/**
	 * Method to test find method of MissingNumberFinder class with null input
	 * 
	 * @throws NoMissingNumberFoundException
	 * @throws EmptyArrayException
	 */
	@Test(expected = EmptyArrayException.class)
	public void testMissingNumberInAnEmptyArrayThrowsException() throws NoMissingNumberFoundException, EmptyArrayException{
		int[] input = {};
		MissingNumberFinder.find(input);
	}
}
