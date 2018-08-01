import java.util.ArrayList;
import java.util.List;

public class lambdaUsage
{
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Jill");
		names.add("Harry");
		names.add("Potter");
		
		names.forEach(element ->System.out.println(element));
		names.forEach(element ->{
			System.out.print("Next: ");
			System.out.println(element);
			});
		System.out.println(names.stream().filter(element -> element.equals("John")).count());
		
		long count = names.stream()
				.filter(element -> element.equals("John"))
				.count();
		

	}
}