import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class calcAction extends RecursiveAction
{
	private static final long serialVersionUID = 1L;
	List<Integer> data;
	private static final int THRESHOLD = 5;
	
	public calcAction(List<Integer> data)
	{
		this.data = data;
	}
	
	protected void compute() 
	{
		if(data.size()<=THRESHOLD)
		{	
			long result = calculateSum(data);
			System.out.format("Sum of %s:%d \n", data,result);
		}	
		else
		{	
			int mid = data.size()/2;
			calcAction firstCalcAtion = new calcAction(data.subList(0, mid));
			calcAction secondCalcAtion = new calcAction(data.subList(mid, data.size()));
			invokeAll(firstCalcAtion,secondCalcAtion);
		}
	}
	
	private long calculateSum(List<Integer> data)
	{
		return data.stream().count();
	}
}

public class test
{
	public static void main(String[] args)
	{
		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("Parallelism: "+pool.getParallelism());
		System.out.println("Pool size: "+pool.getPoolSize());
		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(6);
		data.add(7);
		data.add(8);
		data.add(9);
		data.add(10);
		data.add(11);
		data.add(12);
		data.add(13);
		data.add(14);
		data.add(15);
		
		calcAction calc = new calcAction(data);
		pool.invoke(calc);
	}
}