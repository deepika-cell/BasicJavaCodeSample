import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8Stream
{
	public static void main(String[] args)
	{
		List<String> strings = new ArrayList<String>();
		strings.add("Test");
		strings.add("");
		strings.add("Testing");
		strings.add("check");
		strings.add("checking");
		
		Stream<String> sstrings = strings.stream();
		
		strings.stream().forEach(element-> System.out.println(element));
		System.out.println("Count of strings: "+strings.stream().count());

		System.out.println("Count of empty strings: "+strings.stream()
													.filter(element ->element.isEmpty())
													.count());

		System.out.println("Count of 4 letter strings: "+strings.stream()
													.filter(element -> element.length() == 4)
													.count());
		
		
	}
}