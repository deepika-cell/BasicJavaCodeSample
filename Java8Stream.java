import java.util.ArrayList;
import java.util.EnumSet;
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
		
		EnumSet.allOf(Format.class).stream().forEach(element -> System.out.println(element));
							
		boolean count = EnumSet.allOf(Format.class).stream().anyMatch(element -> element.toString().matches("XML"));
				
		boolean count1 = EnumSet.allOf(Format.class).stream().anyMatch(element -> element.getFormat().matches("TwoP"));
		
		System.out.println("Count : "+ count);
		System.out.println("Count1 : "+ count1);
	}
}

enum Format
{
	XML("XML"),
	JSON("JSON"),
	TwoP("2P");
	
	private String format;
	
	private Format(String format)
	{
		this.format = format;
	}
	
	public String getFormat()
	{
		return format;
	}
}