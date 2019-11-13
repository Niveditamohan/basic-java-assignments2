package com.training.duplicatecharacters.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.duplicatecharacters.TrimDuplicate;

public class TestTrimDuplicates {

	@Test
	public void testTrimDuplicateForValidInput() {
		assertEquals("abc", TrimDuplicate.trim("abcabcabc"));
	}
}
