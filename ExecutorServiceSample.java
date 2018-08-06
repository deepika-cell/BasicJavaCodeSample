import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceSample
{
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for(int i=0;i<10;i++)
		{
			worker wrk = new worker(i);
			executor.execute(wrk);
//			executor.execute(()->{System.out.println("Executor");});   Using Lambda Expression
			
		}
		executor.shutdown();
	}
}

class worker implements Runnable
{
	private int number;
	
	public worker(int number)
	{
		this.number=number;
	}
	
	public void run() {
		System.out.println("Running "+number);
	}
	
}