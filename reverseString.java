public class reverseString
{
	public static void main(String[] args)
	{
		String str= "Reverse this string";
		char[] inputChar = str.toCharArray();
		StringBuffer outStr = new StringBuffer();
		
		for(int i=inputChar.length-1;i>=0;i--)
			outStr.append(inputChar[i]);
		System.out.println(outStr);
	}
}