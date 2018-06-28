// Check if a given number is Prime or Not
public class primeNumberCheck
{
	public static void main(String args[])
	{
//		Integer i=Integer.parseInt(args[0]);
		int i=37;
		System.out.println(Math.sqrt(i));
		Boolean isPrime = true;
		for(int j=2;j<=Math.sqrt(i);j++)
		{
			if(i%j==0)
			{	
				isPrime=false;
				break;
			}	
		}
		if(isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}