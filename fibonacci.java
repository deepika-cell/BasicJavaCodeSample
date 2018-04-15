public class fibonacci
{
	public static void main(String[] args)
	{
		int no = 10;
		int lastTolastNo=0;
		int lastNo=0;
		int currNo=0;
		int[] fibbo = new int[no];
		
		for(int i=0;i<=fibbo.length-1;i++)
		{	
			if(i==0)
			{	
				fibbo[i]=0;
				lastTolastNo=0;
			}	
			else if(i==1)
			{	
				fibbo[i]=1;
				lastNo=1;
			}
			else
			{	
				currNo=lastTolastNo+lastNo;
				fibbo[i]=currNo;
				lastTolastNo=lastNo;
				lastNo=currNo;
			}	
		}
		for(int i:fibbo)
			System.out.println(i);
	}
}