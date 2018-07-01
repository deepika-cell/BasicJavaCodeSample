package pattern;

abstract class Sandwich
{
	private String desc = "plain sandwich";

	public String getDesc() {
		return desc;
	}
	
	public abstract double price();
}

class BrownBreadSandwich extends Sandwich
{
	public BrownBreadSandwich(String desc)
	{
		desc=desc;
	}
	public double price() {
		return 3.50;
	}
}

abstract class SandwichDecorator extends Sandwich
{
}

class CheeseSandwichDecorator extends SandwichDecorator
{
	Sandwich sandwich;
	
	public CheeseSandwichDecorator(Sandwich sandwich)
	{
		this.sandwich = sandwich;
	}
	public double price() {
		return sandwich.price()+1.50;
	}
}

public class decorator
{
	public static void main(String[] args)
	{
		Sandwich mySandwich = new BrownBreadSandwich("Brown Bread");
		
		mySandwich = new CheeseSandwichDecorator(mySandwich);
		System.out.println(mySandwich.price());
	}
}