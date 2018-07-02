package pattern;

//Allows one of a family of algorithms to be selected on-the-fly at run-time.

interface PaymentStrategy
{
	public void pay(int amount);
}

class CreditCardPaymentStrategy implements PaymentStrategy
{
	private String cardNumber, ccv;
	
	public CreditCardPaymentStrategy(String cardNumber, String ccv)
	{
		this.cardNumber = cardNumber;
		this.ccv = ccv;
	}
	public void pay(int amount) 
	{
		System.out.println("Credit card payment made");	
	}
}

class DebitCardPaymentStrategy implements PaymentStrategy
{
	private String dcardNumber, name;
	
	public DebitCardPaymentStrategy(String dcardNumber, String name)
	{
		this.dcardNumber = dcardNumber;
		this.name = name;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Debit card payment made");	
	}
}

class ShoppingCart
{
	private String item;
	private int amount;
	public ShoppingCart(String item, int amount)
	{
		this.item=item;
		this.amount= amount;
	}
	
	public void pay(PaymentStrategy paymentStrategy)
	{
		paymentStrategy.pay(amount);
	}
}

public class strategy
{
	public static void main(String[] args)
	{
		PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy("123456","333");
		ShoppingCart shoppingCart = new ShoppingCart("Ball",15);
		shoppingCart.pay(paymentStrategy);
	}
}
