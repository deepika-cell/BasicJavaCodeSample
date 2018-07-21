package pattern;

class User
{
	private String firstName;	//required
	private String lastName;	//required
	private String middleName;	//optional
	private int age;			//optional
	private String phone;		//optional
	
	private User(UserBuilder userBuilder)
	{
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.middleName = userBuilder.middleName;
		this.age = userBuilder.age;
		this.phone = userBuilder.phone;
	}
	
	public static class UserBuilder
	{
		private String firstName;	
		private String lastName;	
		private String middleName;	
		private int age;			
		private String phone;		
		
		public UserBuilder(String firstName,String lastName)
		{
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder middleName(String middleName)
		{
			this.middleName= middleName;
			return this;
		}
		public UserBuilder age(int age)
		{
			this.age= age;
			return this;
		}
		public UserBuilder phone(String phone)
		{
			this.phone= phone;
			return this;
		}
		
		public User build()
		{
			User user = new User(this);
			return user;
		}
	}
}

public class builder
{
	public static void main(String[] args)
	{
		User user1 = new User.UserBuilder("John","XXX")
					.age(40)
					.build(); // no middle name and phone
		
		User user2 = new User.UserBuilder("Jack","YYY")
					.age(40)
					.middleName("Middle")
					.build(); // no phone
		
	}
}