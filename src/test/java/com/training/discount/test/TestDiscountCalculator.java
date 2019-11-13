package com.training.discount.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.training.discount.DiscountCalculator;
import com.training.discount.exception.InvalidInputException;

public class TestDiscountCalculator {
	
	/**
	 * Method to test the calcualteNewPrice() method of the DiscountCalculator class for valid input
	 * @throws InvalidInputException
	 */
	@Test
	public void testDiscountCalculator() throws InvalidInputException {
		assertEquals(91000, DiscountCalculator.calculateNewPrice(140000), 0.02);
	}
	
	/**
	 * Method to test the calcualteNewPrice() method of the DiscountCalculator class for invalid input
	 * @throws InvalidInputException
	 */
	@Test(expected = InvalidInputException.class)
	public void testIncorrectInput() throws InvalidInputException {
		DiscountCalculator.calculateNewPrice(0);
	}
}
