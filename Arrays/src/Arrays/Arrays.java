package Arrays;
import java.util.Scanner;
public class Arrays
	{
		
		static Scanner userInput = new Scanner (System.in);
		
		public static void main(String[] args)
			{
				//numberOfSweets();
				//sumOfArray();
			}

		public static void numberOfSweets()
		{
			System.out.println("Hello! How many sweets do you like?");
			int numberOfSweet = userInput.nextInt()+1;
			System.out.println("You have " + (numberOfSweet-1) + " sweets. Please List them.");
			String[] mySweetsArray = new String[numberOfSweet];
			
			for (int i= 0; i <numberOfSweet; i++)
				{
				 mySweetsArray [i] = userInput.nextLine();
				}
			for (String s : mySweetsArray)
				{
					System.out.println(s);
				}
		}
		public static void sumOfArray()
		{
		System.out.println("please put in 8 number");
		
		
		int [] myNumberArrays= new int[8];
		for (int i= 0; i <8; i++)
			{
				myNumberArrays [i] = userInput.nextInt();
			}
		int sumOfOdds = 0;
		int sumOfEven = 0;
		for (int s : myNumberArrays  )
		{
		
		
		if( myNumberArrays[s] % 2 == 0) 
			{
				sumOfEven += myNumberArrays[s];
			}
		else 
			{
			sumOfOdds += myNumberArrays[s];
		}
			
			
		}
	System.out.println(sumOfOdds);
	System.out.println(sumOfEven);
	
		}
		
		public static void random5()
		{
			int [] myRandomArrays = new int[5];
			
			
			
	
			
		}
	}
		
