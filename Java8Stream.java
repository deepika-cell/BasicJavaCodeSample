import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream
{
	public static void main(String[] args)
	{
		List<String> strings = Arrays.asList("Test","","Testing","check","Checking");
		
		strings.stream().forEach(element-> System.out.println(element));
		System.out.println("Count of strings: "+strings.stream().count());

		System.out.println("Count of empty strings: "+strings.stream()
													.filter(element ->element.isEmpty())
													.count());

		System.out.println("Count of 4 letter strings: "+strings.stream()
													.filter(element -> element.length() == 4)
													.count());
		
		EnumSet.allOf(Format.class).stream().forEach(element -> System.out.println(element));
							
		System.out.println(EnumSet.allOf(Format.class).stream().anyMatch(element -> element.toString().matches("XML")));
		System.out.println(EnumSet.allOf(Format.class).stream().anyMatch(element -> element.getFormat().matches("TwoP")));

		List<String> stringsStartingWithA = strings.stream().filter(element -> element.startsWith("T")).collect(Collectors.toList());
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