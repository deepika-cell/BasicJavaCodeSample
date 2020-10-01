// To print fibonacci series i.e. 0 1 1 2 3  5  8  12  20 ........ upto n terms
public class fibonacci
{
	public static void main(String[] args)
	{
		int n = 10;
		int first = 0;
		int second =0;
		int third = 0;
		int[] fibbo = new int[no];
		
		for(int i=0;i<=fibbo.length-1;i++)
		{	
			if(i==0)
			{	
				fibbo[i]=0;
				first=0;
			}	
			else if(i==1)
			{	
				fibbo[i]=1;
				second =1;
			}
			else
			{	
				third = first + second;
				fibbo[i]=third;
				first = second;
				second = third ;
			}	
		}
		for(int i:fibbo)
			System.out.println(i);
	}
}
