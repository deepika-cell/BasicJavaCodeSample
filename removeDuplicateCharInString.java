import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Removes duplicates from a string
public class removeDuplicateCharInString
{
	public static void main(String[] args)
	{
		String ipStr = "The day is very beautiful";
		char[] ipChar = ipStr.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new HashSet<Character>();
		
		for(char c : ipChar)
		{
			if(c==' ')
			{
				sb.append(c);
				continue;
			}
			if(!set.contains(c))
			{
				set.add(c);
				sb.append(c);
			}
		}
		System.out.print(sb);
	}
}