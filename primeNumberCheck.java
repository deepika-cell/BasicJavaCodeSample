// Check if a given number is Prime or Not
public class primeNumberCheck
{
	public static void main(String args[])
	{
		Integer i=Integer.parseInt(args[0]);
		if(i%2==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}