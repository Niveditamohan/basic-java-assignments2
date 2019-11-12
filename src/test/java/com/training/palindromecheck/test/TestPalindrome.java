package com.training.palindromecheck.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.palindromecheck.PalindromeCheck;

public class TestPalindrome {

	/**
	 * Tests the verify() method of the PalindromeCheck class for positive input
	 */
	@Test
	public void testPalindromeForPositiveInteger() {
		assertEquals("Palindrome", PalindromeCheck.verify(101));
	}
	
	/**
	 * Tests the verify() method of the PalindromeCheck class for negative input
	 */
	@Test
	public void testPalindromeForNegativeInteger() {
		assertEquals("Not Palindrome",PalindromeCheck.verify(-121));
	}
	
}
