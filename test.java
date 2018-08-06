import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test
{
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<Long>> futures = new ArrayList<Future<Long>>(); 
		
		for(int i=0;i<10;i++)
		{
			Future<Long> future =executor.submit(new myCall(i) );
			futures.add(future);
		}
		executor.shutdown();
		
		for(Future<Long> future: futures)
		{	
			try
			{
				System.out.println(future.get());
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}

class myCall implements Callable<Long>
{
	int i;
	public myCall(int i)
	{
		this.i=i;
	}
	public Long call() 
	{
		return new Long(i);
	}
}