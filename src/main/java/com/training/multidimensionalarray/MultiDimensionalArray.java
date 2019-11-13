package com.training.multidimensionalarray;

import com.training.multidimensionalarray.exception.EmptyInputException;

public class MultiDimensionalArray {

	/**
	 * Method to find the input element in the matrix 
	 * @return Returns true if element is found otherwise false
	 * @throws EmptyInputException
	 */
	public static boolean searchElement(int[][] matrix, int element) throws EmptyInputException {

		boolean answer = false;
		if (matrix.length == 0)
			throw new EmptyInputException("Please provide a matrix!");
		else {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (matrix[i][j] == element) {
						answer = true;
						break;
					}
				}
			}
			return answer;
		}
	}
}
