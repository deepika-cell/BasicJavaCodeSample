// Reverse a given String
public class reverseString
{
	public static void main(String args[])
	{
		String str = args[0];
		
		char[] ipChar = str.toCharArray(); 			// convert String to Char Array
		char[] result = new char[ipChar.length];
		
		for(int i=ipChar.length-1;i>=0;i--)
		{
			System.out.println(ipChar[i]);
			result[(ipChar.length-1)-i]=ipChar[i];
		}
		String strResult = new String(result);
		System.out.println(strResult);
	}
}