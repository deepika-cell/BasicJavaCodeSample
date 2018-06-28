public class StringPalindrome
{
	public static void main(String[] args)
	{
		String inStr= "bob";
		char[] inChar = inStr.toCharArray();
		int midIndex = inChar.length/2;
		boolean isPalindrome = true; 
		for(int i=0;i<=midIndex;i++)
		{
			int j=inChar.length-1-i;
			System.out.print(j);
			if(inChar[i] != inChar[j])
			{	
				isPalindrome=false;
				break;
			}	
		}
		System.out.println(isPalindrome);	
	}
}