package pattern;

abstract class taxCalculator
{
	abstract void initiate();
	abstract void incomeCalculation();
	abstract void calcTaxPayable();
	abstract void taxPaid();
	
	public void process()
	{
		initiate();
		incomeCalculation();
		calcTaxPayable();
		taxPaid();
	}
}

class residentTaxCalculator extends taxCalculator
{
	void initiate()
	{System.out.println("Initiating tax calculation for resident indian");}
	void incomeCalculation()
	{System.out.println("Income calculation for resident indian");}
	void calcTaxPayable()
	{System.out.println("Tax calculation for resident indian");}
	void taxPaid()
	{System.out.println("Initiating tax payment for resident indian");}
}

class nriTaxCalculator extends taxCalculator
{
	void initiate()
	{System.out.println("Initiating tax calculation for NRI");}
	void incomeCalculation()
	{System.out.println("Income calculation for NRI");}
	void calcTaxPayable()
	{System.out.println("Tax calculation for NRI");}
	void taxPaid()
	{System.out.println("Initiating tax payment for NRI");}
}

public class template
{
	public static void main(String[] args)
	{
		new residentTaxCalculator().process(); 
		new nriTaxCalculator().process(); 
	}
}