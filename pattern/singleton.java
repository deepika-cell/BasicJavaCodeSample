package pattern;

enum singletonEnum
{
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class singleton
{
	public static void main(String[] args)
	{
		singletonEnum singleton = singletonEnum.INSTANCE;
		singleton.setValue(10);
		System.out.println(singleton.getValue());
	}
}