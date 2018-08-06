interface interface1
{
	// default method
	default void getMsg()
	{
		System.out.println("Default method of interface1");
	}
	default void getGreeting()
	{
		System.out.println("Hello from default method of interface1");
	}
	
	// static method
	static void getCannotOverride()
	{
		System.out.println("Sample of interface static method");
	}
}
interface interface2
{
	default void getMsg()
	{
		System.out.println("Default method of interface2");
	}
}
public class InterfaceMethod implements interface1,interface2
{
	// Have to implement getMsg() as its there in both interface1 and interface2; otherwise compilation error
	// No need to implement getGreeting() as its there only in interface1
	public void getMsg()
	{
		System.out.println("child implementation of default method");
	}
	public static void main(String[] args)
	{
		InterfaceMethod myClass = new InterfaceMethod();
		myClass.getMsg();		// will display child implementation 
		myClass.getGreeting();	// will display interface1 implementation
		interface1.getCannotOverride();
	}
}

