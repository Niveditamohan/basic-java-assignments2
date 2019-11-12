package com.training.stringreverse.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.stringreverse.StringReverse;
import com.training.stringreverse.exception.NullStringException;

public class TestStringReverse {

	/**
	 * Tests the reversing operation of the String Reverse class with Valid Inputs
	 */
	@Test
	public void testStringReverseWithValidInput() throws NullStringException {
		String expected = "sihT si mrofsnarTi gniniart margorp";
		assertEquals(expected, StringReverse.reverse("This is iTransform training program"));
	}
	
	/**
	 * Tests the reversing operation of the String Reverse class with Invalid Inputs and throws exception
	 */
	@Test(expected = NullStringException.class)
	public void testStringReverseWithNullInput() throws NullStringException {
		StringReverse.reverse("");
	}
}
