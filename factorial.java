public class factorial
{
	// program to calculate factorial of a number
	public static void main(String[] args)
	{
		int base=2;
		int power=3;
		int result=0;
		
		if(power>0)
		{	
			for(int i=1;i<=power;i++)
			{
				if(i==1)
					result=base;
				else
					result=result*base;	
			}
		}
		System.out.println(result);		
	}
}