/**
* <h1>Solution to the Problem 1.4 in Cracking the coding interview - edition 6</h1>
* <b>Given  input string check if it is permutations of palindrome</b>
* <i>Usage: java PalindromePermutation1 String </i>
* @author Janaky Murthy
* @version 1.0
* @since 14/02/2017						
*/

public class PalindromePermutation1 {


	public static boolean isPalPermutation(String s) {
		/* checks for permutation in case insensitive  manner*/
		/* ignores spaces */

		// O(n) time

		// convert to lower case
		s = s.toLowerCase();

		int oddCount = 0;
		int [] charCount = new int[26];

		for(int i = 0; i < s.length(); i++) {
			int pos = (int)s.charAt(i) - (int) 'a';
			charCount[pos]++;
			if(charCount[pos] % 2 == 1) oddCount++;
			else oddCount--;
		}

		if(oddCount > 1) return false;
		return true;


	}

	public static void main(String [] args) {

		try {

			String s = args[0];
			if(isPalPermutation(s)) 
				System.out.println(s + " is a permutation of palindrome");
			else 
				System.out.println(s + " is not a permutation of palindrome");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage:java PalindromePermutation1 String");
		}
	}
}
