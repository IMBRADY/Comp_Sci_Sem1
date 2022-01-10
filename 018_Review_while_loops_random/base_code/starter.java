import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand1 = new Random();
	Scanner sc = new Scanner(System.in);
	int num1 = rand1.nextInt(999);
	int a = 1;
	int secret = a+num1;
	System.out.println("I'm thinking of a number from 1-1000, can you guess it?");
	while(true)
	{	
		int guess = sc.nextInt();
		if(guess == secret)
		{
			System.out.println("Nice job, that was my number!");
			break;
		}
		
		System.out.println("Guess again");
	}

		
	}
}
