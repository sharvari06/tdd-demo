package com.agilewaters.tdd.palindrome;

public class Palindrome {

	public static boolean isPalindrome(String input) {
		input=input.replace(" ", "");
		StringBuffer temp = new StringBuffer(input);
		if(input.equalsIgnoreCase(temp.reverse().toString())){
			
			return true;
		}
		return false;
	}

}


