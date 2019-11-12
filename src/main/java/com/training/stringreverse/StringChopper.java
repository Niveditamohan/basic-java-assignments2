package com.training.stringreverse;

import com.training.stringreverse.exception.WordNotFoundException;

public class StringChopper {

	/**
	 * Trims the extra spaces in between the words in a sentence
	 */
	public static String deleteSpaces(String input) {
		String[] words = input.replaceAll("\\s+", " ").trim().split(" ");
		String newString = "";

		for (int i = 0; i < words.length; i++) {
			newString += words[i] + " ";
		}
		return newString.trim();
	}

	/**
	 * Deletes a word whose position is specified by the user
	 */
	public static Object deleteWord(String input, String word, int position) throws WordNotFoundException {
		String trimmedString = deleteSpaces(input);
		String[] trimmedStringWords = trimmedString.split(" ");

		if (trimmedString.contains(word)) {
			String newString = "";
			for (int i = 0; i < trimmedStringWords.length; i++) {
				if(trimmedStringWords[i].equals(word) && i == position-1) {
					continue;
				}
				else {
					newString += trimmedStringWords[i] + " ";
				}
			}
			return newString.trim();
		}
		
		else {
			throw new WordNotFoundException("Please provide a word that is present in the sentence.");
		}
				
	}

}
