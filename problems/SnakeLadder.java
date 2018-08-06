package problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class SnakeLadder
{
	static final int winCount = 100;
	static int currentPosition =0;
	Map<Integer, Integer> snake = new HashMap<Integer,Integer>();
	Map<Integer, Integer> ladder = new HashMap<Integer,Integer>();

	private int rollDice()
	{
		int n=0;
		Random random = new Random();
		n=random.nextInt(7);
		return (n==0?1:n);
	}
	private void setSnake()
	{
		snake.put(10, 5);
		snake.put(20, 7);
		snake.put(35, 10);
		snake.put(67, 20);
		snake.put(98, 55);
	}
	private void setLadder()
	{
		ladder.put(5, 15);
		ladder.put(15, 27);
		ladder.put(25, 40);
		ladder.put(50, 65);
		ladder.put(70, 89);
	}
	private int calcPosition(int dice)
	{
		int position = currentPosition;
		position=(currentPosition+dice)>100?position:currentPosition+dice;
		Iterator<Integer> itsnake = snake.keySet().iterator();
		int i,j;
		while(itsnake.hasNext())
		{
			i = itsnake.next().intValue();
			if(position==i)
				position = snake.get(i);
		}

		Iterator<Integer> itladder = ladder.keySet().iterator();
		while(itladder.hasNext())
		{
			j=itladder.next().intValue();
			if(position==j)
				position = ladder.get(j);
		}
		return position;
	}
	
	public static void main(String[] args)
	{
		SnakeLadder snakeLadder = new SnakeLadder();
		snakeLadder.setLadder();
		snakeLadder.setSnake();
		int dice =0;
		int noofRoll=0;
		
		while(true)
		{
			noofRoll++;
			dice = snakeLadder.rollDice();
			currentPosition = snakeLadder.calcPosition(dice);
			if(currentPosition==winCount)
			{
				System.out.println("Win after rolls: " +noofRoll);
				break;
			}
		}
	}
}