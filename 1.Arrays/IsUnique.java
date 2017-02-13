
import java.lang.Integer; // for Integer.parseInt()

/* Usage: java IsUnique Number_of_Strings String1 String2 .. StringN */

public class IsUnique{

	public static boolean unique(String s)
	{
		// Assume 0-255 Characters
		if(s.length() > 256) return false;

		// create boolean array to keep track of characters in s
		boolean charPresent[] = new boolean[255];

		for(int i = 0; i < s.length(); i++)
		{
			int charValue = s.charAt(i);
			if(charPresent[charValue]) return false;
			charPresent[charValue] = true;
		}

		return true;
	}

	public static void main(String [] args)
	{

		try {
			// get the number of Input String
			int n = Integer.parseInt(args[0]); 

			// Check Uniqueness of each input
			for(int i = 0; i < n; i++)
			{
				String s = args[i+1];
				if(IsUnique.unique(s))  System.out.println( s + " has all unique characters");
				else System.out.println(s + " does not have all unique characters");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("The number of strings must be Integer");
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The number of strings in the list must be as specified by the argument");
		}
	}
}