package pattern;

interface mobile
{
	public int getPrice();
	public String getName();
}

class nokiaMobile implements mobile
{
	private int price;
	private String name;
	
	public nokiaMobile(String name,int price)
	{
		this.name = name;
		this.price= price;
	}
	public int getPrice() {
		return price;
	}
	public String getName()
	{
		return name;
	}
}

class samsungMobile implements mobile
{
	private int price;
	private String name;
	public samsungMobile(String name,int price)
	{
		this.name = name;
		this.price= price;
	}
	public int getPrice() {
		return price;
	}
	public String getName()
	{
		return name;
	}
}

class MobileFactory
{
	mobile imobile;
	public mobile getMobile(String vendor)
	{
		if(vendor.equalsIgnoreCase("Nokia"))
			imobile= new nokiaMobile("Nokia",10000);
		if(vendor.equalsIgnoreCase("samsung"))
			imobile= new samsungMobile("Samsung",15000);
		return imobile;
	}
}

public class factory
{
	public static void main(String[] args)
	{
		mobile imobile = new MobileFactory().getMobile("Nokia");
		System.out.println(imobile.getName());
		System.out.println(imobile.getPrice());
	}
}