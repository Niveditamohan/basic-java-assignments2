package com.training.nameoccurence;

import com.training.nameoccurence.exception.InvalidInputException;
import com.training.nameoccurence.exception.NoSuchNameFoundException;

public class FrequencyFinder {

	/**
	 * Method that accepts a name and an array input and 
	 * finds frequency of the name input by the user in the array
	 * 
	 * @return Returns the frequency count of the name
	 * 
	 * @throws NoSuchNameFoundException
	 * @throws InvalidInputException
	 */
	public static int count(String[] input, String name) throws NoSuchNameFoundException, InvalidInputException {
		int frequency = 0;
		if (input.length == 0 || name.length() == 0)
			throw new InvalidInputException("Please provide valid inputs!");
		else {
			for (int i = 0; i < input.length; i++) {
				if (name.matches(input[i]))
					frequency++;
				else
					continue;
			}

			if (frequency == 0)
				throw new NoSuchNameFoundException("No such name found in the array.");
			else
				return frequency;
		}
	}
}
