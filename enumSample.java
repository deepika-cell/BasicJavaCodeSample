// basic enum
enum userStatus
{
	ACTIVE,
	INACTIVE,
	PENDING;
}

// enum with custom enum values
enum myStatus
{
	START("Start"),
	RUNNING("In Progress"),
	STOPPED("Stopped");
	
	private String status;
	private myStatus(String status)
	{
		this.status = status;
	}
	
	public String getStatus()
	{
		return this.status;
	}
}

// enum with method
enum enumWithMethod
{
	PLUS,
	MINUS,
	MULTIPLY;
	double calculate(double i,double j)
	{
		switch(this)
		{
			case PLUS:
				return i+j;
			case MINUS:
				return i-j;
			case MULTIPLY:
				return i*j;
			default:
				return 0;
		}
	}
	void test()
	{
		System.out.println("Testing enum method");
		System.out.println(this);
	}
}

public class enumSample
{
	public static void main(String[] args)
	{
		System.out.println(userStatus.ACTIVE);
		System.out.println(enumWithMethod.PLUS.calculate(2,5));
		enumWithMethod.MULTIPLY.test();
		System.out.println(myStatus.START.getStatus());
	}
}