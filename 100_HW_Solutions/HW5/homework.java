import java.util.Scanner;
import java.util.Random;

class homework {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int dollars = 100;
	int a = 1;
	int x;
	while(true)
	{
		x = 0;
		System.out.println("You have "+dollars+" dollars");
		System.out.println("Would you like to gamble?");
		String answer = sc.nextLine();
		if(answer.equals("yes") || answer.equals("Yes") || answer.equals("y") || answer.equals("Y")) 
		{
			x = 1;
			System.out.println("How much would you like to bet?");
			int bet = sc.nextInt();
			sc.nextLine();
			if(bet > dollars)
			{
				System.out.println("Insufficient funds");
			}
			else if(bet <= dollars)
			{
				dollars = dollars-bet;
				Random rand1 = new Random();
				Random rand2 = new Random();
				Random rand3 = new Random();
				int num1 = a+rand1.nextInt(10);
				int num2 = a+rand2.nextInt(10);
				int num3 = a+rand3.nextInt(10);
				System.out.println("| "+num1+" | "+num2+" | "+num3+" |");
				if(num1 == num2 && num2 == num3)
				{
					System.out.println("BIG MONERS!!");
					bet = bet+bet+bet;
					dollars = dollars+bet;
				}
				else if(num1 == num2 || num2 == num3 || num1 == num3)
				{
					System.out.println("You're win!");
					bet = bet+bet;
					dollars = dollars+bet;
				}
				else
				{
					System.out.println("You're lose :(");
				}
			}
		}
		if(answer.equals("No") || answer.equals("no") || answer.equals("n") || answer.equals("N"))
		else if(x != 0)
		{
			System.out.println("no");
		}
		if(dollars <= 0)
		{
			System.out.println("You're are all out of money, better luck next time");
			break;
		}
	}
	}	
}
