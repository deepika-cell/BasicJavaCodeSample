public class lambda
{
	// functional interface
	interface MathOperation
	{
		int operate(int a, int b);
	}
	
	interface Greetings
	{
		void show(String msg);  
	}
	
	private int operate(int a, int b, MathOperation mathOperation)
	{
		return mathOperation.operate(a, b);
	}
	
	public static void main(String[] args)
	{
		MathOperation addition = (int a, int b) -> {return a+b;};
		MathOperation substraction = (int a, int b) -> {return a-b;};
		System.out.println(addition.operate(10, 5));
		System.out.println(substraction.operate(10, 5));
		
		Greetings dayGreeting= (String msg) -> System.out.println(msg);
		Greetings eveningGreeting= (String msg) -> System.out.println(msg);
		dayGreeting.show("Good Day");
		eveningGreeting.show("Good Evening");
		
		lambda lambda1 = new lambda();
		System.out.println(lambda1.operate(10, 5,addition));
		
	}
}