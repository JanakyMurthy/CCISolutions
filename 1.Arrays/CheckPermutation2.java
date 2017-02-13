/**
* <h1>Solution to the Problem 1.2 in Cracking the coding interview - edition 6</h1>
* <b>Given 2 input strings check if they are permutations of each other</b>
* <i>Usage: java CheckPermutation1 String1 String2 </i>
* @author Janaky Murthy
* @version 1.0
* @since 13/02/2016						
*/

import java.lang.*; // for all the string methods
import java.util.Arrays; // for the Array Class and Sort methods

public class CheckPermutation2{

	public static boolean checkPermutation(String s1, String s2)
	{
		// Approach: Count the occurence of each char and see if they are equal
		// Efficient O(n) time O(c) space where c is the number of char in char set

		// Remove Spaces
		s1 = s1.replaceAll("\\s","");
		s2 = s2.replaceAll("\\s","");

		if(s1.length() != s2.length()) return false;

		// Convert Both strings to lower case
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// Maintain an array to count char for each string
		int [] letterCount = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			int pos = (int) s1.charAt(i);
			letterCount[i]++;
		}

		for(int i = 0; i < s2.length(); i++) {
			int pos = (int) s2.charAt(i);
			letterCount[i]--;
			if(letterCount[i] < 0) return false;
		}

		return true;
	}


	public static void main(String [] args){

		try {
			// get the two strings
			String s1 = args[0];
			String s2 = args[1];

			// check and print result
			if(CheckPermutation2.checkPermutation(s1,s2)) 
				System.out.println(s1 + " and " + s2 + " are permutations of each other");
			else 
				System.out.println(s1 + " and " + s2 + " are not permutations of each other");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: java CheckPermutation2 String1 String2");
		}
	}
}