enum mySingleton
{
	INSTANCE;
}

public class test
{
	public static void main(String[] args)
	{
		mySingleton imySingleton = mySingleton.INSTANCE;
	}
}