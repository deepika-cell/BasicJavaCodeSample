import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class sumAction extends RecursiveAction
{
	private static final long serialVersionUID = 1L;
	List<Long> data;
	private static final int threshold=5;
	
	public sumAction(List<Long> data)
	{
		this.data = data;
	}
	protected void compute()
	{
		if(data.size()<=threshold)
		{
			Long result = compute(data);
			System.out.format("Sum of %s: %d \n", data.toString(), result);
		}
		else
		{
			int mid = data.size()/2;
			sumAction firstTask = new sumAction(data.subList(0, mid));
			sumAction secondTask = new sumAction(data.subList(mid, data.size()));
			invokeAll(firstTask,secondTask);
		}
	}
	private Long compute(List<Long> data)
	{
		Long result=new Long(0);
		for(Long lng:data)
		{
			result = result+lng;
		}
		return result;
	}
}

public class ForkJoin
{
	public static void main(String[] args)
	{
		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("Pool parallelism: " + pool.getParallelism());
		
		List<Long> data = new ArrayList<Long>();
		data.add(new Long(1));
		data.add(new Long(2));
		data.add(new Long(3));
		data.add(new Long(4));
		data.add(new Long(5));
		data.add(new Long(6));
		data.add(new Long(7));
		data.add(new Long(8));
		data.add(new Long(9));
		data.add(new Long(10));
		data.add(new Long(11));
		data.add(new Long(12));
		data.add(new Long(13));
		data.add(new Long(14));
		data.add(new Long(15));
		data.add(new Long(16));
		data.add(new Long(17));
		data.add(new Long(18));
		data.add(new Long(19));
		data.add(new Long(20));
		data.add(new Long(21));
		data.add(new Long(22));
		data.add(new Long(23));
		
		sumAction sum = new sumAction(data);
		pool.invoke(sum);
	}
}