package com.training.discount;

import com.training.discount.exception.InvalidInputException;

public class DiscountCalculator {

	/**
	 * Method to calculate discount price; accepts the double newItem amount as parameter 
	 *
	 * @return
	 * @throws InvalidInputException
	 */
	public static double calculateNewPrice(double newItem) throws InvalidInputException {
		if (newItem == 0)
			throw new InvalidInputException("Please provide a valid price!");
		else {
			double discount = 0.35 * newItem;
			double newItemPrice = newItem - discount;
			return newItemPrice;
		}
	}
}
