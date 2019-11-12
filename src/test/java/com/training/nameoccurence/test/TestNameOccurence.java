package com.training.nameoccurence.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.training.nameoccurence.FrequencyFinder;
import com.training.nameoccurence.exception.InvalidInputException;
import com.training.nameoccurence.exception.NoSuchNameFoundException;

public class TestNameOccurence {

	/**
	 * String array input
	 */
	private String[] input = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", 
			"Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", 
			"Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", 
			"Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
	
	/**
	 * Method to test count method of the FrequencyFinder class for valid inputs
	 * @throws NoSuchNameFoundException
	 * @throws InvalidInputException
	 */
	@Test
	public void testNameFrequencyForCorrectInput() throws NoSuchNameFoundException, InvalidInputException {
		assertEquals(2, FrequencyFinder.count(input,"Sam"));
	}
	
	/**
	 * Method to test count method of the FrequencyFinder class for invalid name input
	 * @throws NoSuchNameFoundException
	 * @throws InvalidInputException
	 */
	@Test(expected = NoSuchNameFoundException.class)
	public void testNameFrequencyForIncorrectInputThrowsException() throws NoSuchNameFoundException, InvalidInputException {
		FrequencyFinder.count(input, "Nivedita");
	}
	
	/**
	 * Method to test count method of the FrequencyFinder class for empty array input
	 * @throws NoSuchNameFoundException
	 * @throws InvalidInputException
	 */
	@Test(expected = InvalidInputException.class)
	public void testNameFrequencyForEmptyArrayThrowsException() throws NoSuchNameFoundException, InvalidInputException {
		String[] newInput = {};
		FrequencyFinder.count(newInput, "Nivedita");
	}
	
	/**
	 * Method to test count method of the FrequencyFinder class for empty name input
	 * @throws NoSuchNameFoundException
	 * @throws InvalidInputException
	 */
	@Test(expected = InvalidInputException.class)
	public void testNameFrequencyForEmptyNameInputThrowsException() throws NoSuchNameFoundException, InvalidInputException {
		FrequencyFinder.count(input, "");
	}
}
