package pattern;

/*
Problem statement: 
Your existing application uses a 3rd party Payment gateway (currentPaymentGateway) for credit card payment.Suddenly you are asked
to use a different payment gateway vendor(newPaymentGateway). New vendor allows newPaymentGateway type of objects, but your application
have reference to currentPaymentGateway object in many places. This also raises the risk on the project, which is already running
on the production 

Solution: Use adapter pattern. Create a adapter which implements newPaymentGateway(Target) and containes the adaptee(currentPaymentGateway).
The adapter will sit in between application code and new payment gateway API.

The Adapter pattern lets you to adapt what an object or a class exposes to what another object or class expects. It converts the interface of
a class into another interface the client expects. It lets classes work together that couldn’t otherwise because of incompatible interfaces. 
It allows to fix the interface between the objects and the classes without modifying the objects and the classes directly.
*/

interface currentPaymentGateway
{
	public String getCreditCardNo();
	public String getCustomerName();
	public Short getCardCVVNo();
	
	public void setCreditCardNo(String creditCardNo);
	public void setCustomerName(String customerName);
	public void setCardCVVNo(Short cardCVVNo);
}

class currentPaymentGatewayImpl implements currentPaymentGateway
{
	private String creditCardNo;
	private String customerName;
	private Short cardCVVNo;

	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Short getCardCVVNo() {
		return cardCVVNo;
	}
	public void setCardCVVNo(Short cardCVVNo) {
		this.cardCVVNo = cardCVVNo;
	}
}

interface newPaymentGateway
{
	public String getCreditCardNo();
	public String getClientName();
	public Short getCVV();
	
	public void setCreditCardNo(String creditCardNo);
	public void setClientName(String customerName);
	public void setCVV(Short cardCVVNo);
}

class newPaymentGatewayImpl implements newPaymentGateway
{
	private String creditCardNo;
	private String clientName;
	private Short CVV;
	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Short getCVV() {
		return CVV;
	}
	public void setCVV(Short cVV) {
		CVV = cVV;
	}
}

class paymentAdapter implements newPaymentGateway
{
	private String creditCardNo;
	private String clientName;
	private Short CVV;
	private final currentPaymentGateway iCurrentPaymentGateway;
	
	public paymentAdapter(currentPaymentGateway iCurrentPaymentGateway)
	{
		this.iCurrentPaymentGateway = iCurrentPaymentGateway;
		setProperties();
	}

	private void setProperties()
	{
		setCreditCardNo(this.iCurrentPaymentGateway.getCreditCardNo());
		setClientName(this.iCurrentPaymentGateway.getCustomerName());
		setCVV(this.iCurrentPaymentGateway.getCardCVVNo());
	}
	
	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Short getCVV() {
		return CVV;
	}

	public void setCVV(Short cVV) {
		CVV = cVV;
	}
}

public class adapter
{
	public static void main(String[] args)
	{
		currentPaymentGateway iCurrentPaymentGateway = new currentPaymentGatewayImpl();
		iCurrentPaymentGateway.setCustomerName("James");
		iCurrentPaymentGateway.setCreditCardNo("11111111");
		iCurrentPaymentGateway.setCardCVVNo((short)333);
		
		newPaymentGateway inewPaymentGateway = new paymentAdapter(iCurrentPaymentGateway);
		System.out.println(inewPaymentGateway.getClientName());
		System.out.println(inewPaymentGateway.getCreditCardNo());
		System.out.println(inewPaymentGateway.getCVV());
	}
}