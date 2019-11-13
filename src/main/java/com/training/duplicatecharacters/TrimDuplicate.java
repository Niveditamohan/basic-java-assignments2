package com.training.duplicatecharacters;

import java.util.Arrays;

public class TrimDuplicate {

	public static String trim(String input) {
		char[] inputString = input.toCharArray();
		Arrays.sort(inputString);
		char[] trimmedString = {};
		int index = 0;

		for (int i = 0; i < input.length()-1; i++) {
			//for (int j = i+1; j < input.length()-1; j++) {
				if (inputString[i] != inputString[i+1]) {
					trimmedString[index] = inputString[i];
					System.out.println(trimmedString);
					index++;
				}
			//}
		}
		String answer = new String(trimmedString);
		return answer;

	}

}
