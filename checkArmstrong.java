public class checkArmstrong
{
	// program to check if a number is Armstrong
	//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
	public static void main(String[] args)
	{
		int noToCheck = 153;
		
		int count=0;
		int no=noToCheck;
		int temp;
		
		while(no>0)
		{
			temp=no%10;
			count = count+(temp*temp*temp);
			no=no/10;		
		}
		System.out.println(count);
	}
}