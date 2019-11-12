package com.training.missingnumber;

import java.util.Arrays;

import com.training.missingnumber.exception.EmptyArrayException;
import com.training.missingnumber.exception.NoMissingNumberFoundException;

public class MissingNumberFinder {

	/**
	 * Method to return missing number
	 * 
	 * @throws NoMissingNumberFoundException
	 * @throws EmptyArrayException
	 */
	public static int find(int[] input) throws NoMissingNumberFoundException, EmptyArrayException {

		if (input.length == 0)
			throw new EmptyArrayException("Please provide valid input.");
		else {
			int number = getMissingNumber(input);
			if (number == 0)
				throw new NoMissingNumberFoundException("No missing number found in the array specified.");
			else
				return number;
		}
	}

	/**
	 * Calculation for finding the missing number
	 * 
	 * @return Returns the missing number and if not present returns 0
	 */
	public static int getMissingNumber(int[] input) {
		int answer = 0;
		Arrays.sort(input);
		
		for (int i = 1; i < (input.length); i++) {
			if ((input[i-1] + 1) == input[i])
				continue;
			else {
				answer = input[i]-1;
				break;
			}
		}

		return answer;
	}

}
