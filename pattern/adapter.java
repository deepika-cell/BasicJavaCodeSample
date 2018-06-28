package pattern;

interface hypervisor
{
	public void provision();
}

class esx implements hypervisor
{
	public void provision()
	{
		System.out.println("ESX provisioned");
	}
}

class hyperV implements hypervisor
{
	public void provision()
	{
		System.out.println("HyperV provisioned");
	}
}

class 