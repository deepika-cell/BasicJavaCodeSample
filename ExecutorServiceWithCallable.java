import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FactorialCalculator implements Callable<Integer>
{
	private int number;
	
	public FactorialCalculator(int i)
	{
		this.number = i;
	}
	
	@Override
	public Integer call() throws Exception 
	{
		int result=1;
		if(number ==0|| number==1)
			result=1;
		else
		{
			for(int i=2;i<=number;i++)
				result = result*i;
		}
		System.out.println("Factorial for "+number+" is "+result);
		return result;
	}
}

public class ExecutorServiceWithCallable
{
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Random random = new Random();
		List<Future<Integer>> results = new ArrayList<Future<Integer>>();
		
		for(int i=0;i<4;i++)
		{
			FactorialCalculator calculator = new FactorialCalculator(random.nextInt(10));
			Future<Integer> future = executor.submit(calculator);
			results.add(future);
		}
		
		for(Future<Integer> future: results)
		{
			try
			{
				System.out.println("Task is done? "+future.isDone());
				System.out.println("Task result: "+future.get());
			}
			catch(Exception ex){}
		}
		executor.shutdown();
	}
}