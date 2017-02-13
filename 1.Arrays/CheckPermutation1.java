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

public class CheckPermutation1{

	public static boolean checkPermutation(String s1, String s2)
	{
		// Approach: Sort the Strings and Compare if they are equal
		// Not efficient since sorting takes minimum O(n logn) time

		// Remove Spaces
		s1 = s1.replaceAll("\\s","");
		s2 = s2.replaceAll("\\s","");

		if(s1.length() != s2.length()) return false;

		// Convert Both strings to lower case
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// Convert String to Array
		// There is No inbuilt function to sort strings in Java
		char s1Arr[] = s1.toCharArray();
		char s2Arr[] = s2.toCharArray();

		// Sort the arrays
		Arrays.sort(s1Arr);
		Arrays.sort(s2Arr);

		s1 = String.valueOf(s1Arr);
		s2 = String.valueOf(s2Arr);

		// Compare the Sorted Strings
		return s1.equals(s2);
	}


	public static void main(String [] args){

		try {
			// get the two strings
			String s1 = args[0];
			String s2 = args[1];

			// check and print result
			if(CheckPermutation1.checkPermutation(s1,s2)) 
				System.out.println(s1 + " and " + s2 + " are permutations of each other");
			else 
				System.out.println(s1 + " and " + s2 + " are not permutations of each other");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: java CheckPermutation1 String1 String2");
		}
	}
}