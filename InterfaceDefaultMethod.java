interface interface1
{
	default void getMsg()
	{
		System.out.println("Default method of interface1");
	}
	default void getGreeting()
	{
		System.out.println("Hello from default method of interface1");
	}
}
interface interface2
{
	default void getMsg()
	{
		System.out.println("Default method of interface2");
	}
}
public class InterfaceDefaultMethod implements interface1,interface2
{
	// Have to implement getMsg() as its there in both interface1 and interface2; otherwise compilation error
	// No need to implement getGreeting() as its there only in interface1
	public void getMsg()
	{
		System.out.println("child implementation of default method");
	}
	public static void main(String[] args)
	{
		InterfaceDefaultMethod myClass = new InterfaceDefaultMethod();
		myClass.getMsg();		// will display child implementation 
		myClass.getGreeting();	// will display interface1 implementation
	}
}

