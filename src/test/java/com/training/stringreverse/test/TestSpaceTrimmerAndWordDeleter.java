package com.training.stringreverse.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.stringreverse.StringChopper;
import com.training.stringreverse.exception.WordNotFoundException;

public class TestSpaceTrimmerAndWordDeleter {

	/**
	 * Tests the space trimmer operation of the String Chopper class
	 */
	@Test
	public void testSpaceTrimmer() {
		String input = "A    MORNING WALK IS A  BLESSING FOR   THE  WHOLE DAY.";
		String expected = "A MORNING WALK IS A BLESSING FOR THE WHOLE DAY."; 
		assertEquals(expected, StringChopper.deleteSpaces(input));
	}
	
	/**
	 * Tests the detect and delete word operation of the String Chopper class
	 */
	@Test
	public void testWordDetectionAndDeleteIfPresent() throws WordNotFoundException {
		String input = "A    MORNING WALK IS A  BLESSING FOR   THE  WHOLE DAY.";
		String expected = "A MORNING WALK IS BLESSING FOR THE WHOLE DAY."; 
		assertEquals(expected, StringChopper.deleteWord(input,"A",5));
	}
	
	/**
	 * Tests the space trimmer operation of the String Chopper class when it throws exception
	 */
	@Test(expected = WordNotFoundException.class)
	public void testWordDetectionAndThrowExceptionIfWordNotFound() throws WordNotFoundException {
		String input = "A    MORNING WALK IS A  BLESSING FOR   THE  WHOLE DAY.";
		StringChopper.deleteWord(input, "WORD", 3);
	}
}
