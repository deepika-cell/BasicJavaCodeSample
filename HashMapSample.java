import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapSample
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("1","Harry");
		map.put("2","Jack");
		map.put("3","Jill");
		
		// Preferred way is to use EntrySet
		for(Map.Entry<String, String> entry: map.entrySet())
		{
			System.out.println("Using Entryset");
			System.out.println("Key: "+entry.getKey()+",Value: "+entry.getValue());
		}
		
		// Same with Java8 Stream
		System.out.println("Using Entryset+Stream");
		map.entrySet().stream().forEach(
				element-> System.out.println("Key: "+element.getKey()+",Value: "+element.getValue())
				);
		
		// Other ways
		System.out.println("Using keyset");
		Iterator<String> it = map.keySet().iterator();
		String key,value;
		while(it.hasNext())
		{
			key=(String)it.next();
			value=map.get(key);
			System.out.println("Key: "+key+",Value: "+value);
		}
	}
}