package com.agilewaters.tdd.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void isPalimdrome_passedValidPalindrome_returnsTrue() {
	assertTrue(Palindrome.isPalindrome("madam"));
	}
	
	@Test
	public void isPalimdrome_passedInValidPalindrome_returnsFalse() {
	assertFalse(Palindrome.isPalindrome("notPalindrome"));
	assertFalse(Palindrome.isPalindrome("wkrjwerj"));
	}
	
	@Test
	public void isPalimdrome_passedValidPalindromePhrase_returnsTrue() {
		assertTrue(Palindrome.isPalindrome("A SANTA AT NASA"));
	}

	@Test
	public void isPalimdrome_passedValidPalindromeNumber_returnsTrue() {
		assertTrue(Palindrome.isPalindrome("4114"));
	}
}
