public class swapNumber
{
	// Swap any two numbers 
	public static void main(String[] args)
	{
		int temp ;
		int x=10;
		int y=15;
		
		System.out.println("X:"+x+" Y:"+y);
		temp = x ;
		x = y;
		y = temp ;
		System.out.println("X:"+x+" Y:"+y);
	}
}
