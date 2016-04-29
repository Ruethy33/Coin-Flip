import java.util.Scanner;

public class CoinFlip 
	{
	
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("how many times should i flip a coin?");
		int counter = 0;
		int time = userInput.nextInt();
		int head = 0; 
		int tail = 0;
		
		while (counter < time)
			{
			int coin = (int)(Math.random()*2)+1;
			if(coin == 1)
				{
				head++;
				counter++;
				}
			else if (coin == 2)
				{
				tail++;
				counter++;
				}
			}
		System.out.println("You had " + head + " heads");
		System.out.println("You had " + tail + " tails");
		}
	}
