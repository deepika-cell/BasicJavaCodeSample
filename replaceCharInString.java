public class replaceCharInString
{
	public static void main(String args[])
	{
		char[] ipChar = args[0].toCharArray();
		char c = args[1].toCharArray()[0];
		
		System.out.println(new String(ipChar));
		System.out.println(new String(args[1].toCharArray()));
		
		for(int i=0;i<=ipChar.length-1;i++)
		{
			if(ipChar[i]=='b'||ipChar[i]=='B')
				ipChar[i]=c;
		}
		System.out.println(new String(ipChar));
	}
}