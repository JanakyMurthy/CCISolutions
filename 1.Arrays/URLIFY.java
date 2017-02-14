/**
* <h1>Solution to the Problem 1.3 in Cracking the coding interview - edition 6</h1>
* <b>Given input string replace each space by '%20' </b>
* <i>Usage: java URLIFY String </i>
* @author Janaky Murthy
* @version 1.0
* @since 13/02/2017					
*/

public class  URLIFY {


	public static String createURL(String s)
	{
		// Convert s to Char Array
		char sc[] = s.toCharArray(); 

		//Count the number of spaces
		int spaces = 0;
		for(int i = 0; i < sc.length; i++) {
			if(sc[i] == ' ')
				spaces++;
		}
		
		// new char arr
		// iterate backwards
		char newsc[] = new char[sc.length + 2*spaces];
		
		for(int i = sc.length-1,  j = newsc.length-1; i >= 0; i--) {
			char c = sc[i];

			// if space is seen then replace it with %20
			if(c == ' ') {
				newsc[j] = '0';
				newsc[j-1] = '2';
				newsc[j-2] = '%';
				j -= 3;
			}
			else {
				newsc[j] = c;
				j -= 1;
			}

		}

		return String.valueOf(newsc);
	}


	public static void main(String [] args) {
		try {

			String s = args[0];
			System.out.println(URLIFY.createURL(s));
		}

		catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("Usage: java URLIFY String");
		}
	}
}
