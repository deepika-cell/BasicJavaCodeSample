public class swapNumber
{
	// Swap 2 numbers without using any other number
	public static void main(String[] args)
	{
		int x=10;
		int y=15;
		
		System.out.println("X:"+x+" Y:"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X:"+x+" Y:"+y);
	}
}