package com.training.stringreverse;

import com.training.stringreverse.exception.NullStringException;

public class StringReverse {

	/**
	 * Reverses each word in an input string 
	 * 
	 *  @return Returns the reversed string
	 */
	public static String reverse(String string) throws NullStringException {
		String reversedString = "";
		if (string.isEmpty()==true)
			throw new NullStringException("Please provide valid input!");
		
		else {
			String[] words = string.split(" ");

			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				String reversedWord = "";

				for (int j = (word.length() - 1); j >= 0; j--) {
					reversedWord += word.charAt(j);
				}
				reversedString += reversedWord + " ";
			}
		}
		return reversedString.trim();
	}

}
