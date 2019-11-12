package com.training.palindromecheck;

public class PalindromeCheck {

	/**
	 * Method to check for Palindrome number
	 * @return Returns a String containing the answer whether Palindrome or not
	 */
	public static String verify(int number) {
		String answer = "";
		String reverse = "";
		
		String input = String.valueOf(number);
		for (int i = (input.length() - 1); i >= 0; i--) {
			reverse += input.charAt(i);
		}

		if (reverse.equals(input))
			answer = "Palindrome";
		else
			answer = "Not Palindrome";

		return answer;
	}

}
