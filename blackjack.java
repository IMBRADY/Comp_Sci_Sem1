import java.util.Scanner;
import java.util.Random;

class blackjack {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		Random rand4 = new Random();
		Random rand5 = new Random();
		Random rand6 = new Random();
		Random rand7 = new Random();
		Random rand8 = new Random();
		Random rand9 = new Random();
		Random rand10 = new Random();
		Random rand11 = new Random();
		Scanner sc = new Scanner(System.in);
		int end = 1;
		int hit = 1;
		int randcard1 = rand1.nextInt(11);
		int randcard2 = rand2.nextInt(11);
		int randcard3 = rand3.nextInt(11);
		int randcard4 = rand4.nextInt(11);
		int randcard5 = rand5.nextInt(11);
		int randcard6 = rand6.nextInt(11);
		int randcard7 = rand7.nextInt(11);
		int randcard8 = rand8.nextInt(11);
		int randcard9 = rand9.nextInt(11);
		int randstart1 = 1;
		int hit1 = 0;
		int hit2 = 0;
		int dealerhit1 = randcard7+randstart1;
		int dealerhit2 = randcard8+randstart1;
		int dealerhit3 = randcard9+randstart1;
		int dealer1 = randcard2+randstart1;
		int dealer2 = randcard3+randstart1;
		int player1 = randcard4+randstart1;
		int player2 = randcard5+randstart1;
		int playerhand = player1+player2;
		int dealerhand = dealer1+dealer2;
		System.out.println("Dealer Cards = "+dealer1+" unknown");
		System.out.println("Your Cards = "+player1+" "+player2);
		while(true)
		{	
			Random rand12 = new Random();
			int randhit1 = rand12.nextInt(11);
			int playerhit = randhit1+randstart1;
			System.out.println("Hit or stay?");
			String cardplay = sc.nextLine();
			if(cardplay.equals("Hit") || cardplay.equals("hit"))
			{
				playerhand=playerhand+playerhit;
				System.out.println(playerhand);
			}
			if(cardplay.equals("Stay") || cardplay.equals("stay"))
			{
				end = end+1;
			}
			if(playerhand > 21)
			{	
				System.out.println("Bust, dealer wins");
				break;
			}
			if(end == 2)
			{	
				break;
			}
		}
		if (end == 2)
		{
			System.out.println("Dealer Hand = "+dealerhand);
			System.out.println("Your Hand = "+playerhand);
			if(dealerhand < playerhand && dealerhand < 17)
			{	
				System.out.println("Dealer hits");
				dealerhand = dealerhand + dealerhit1;
				System.out.println("Dealer Hand = "+dealerhand);
				System.out.println("Your Hand = "+playerhand);
				
				if(dealerhand < playerhand && dealerhand < 17)
				{
					System.out.println("Dealer hits");
					dealerhand = dealerhand + dealerhit2;
					System.out.println("Dealer Hand = "+dealerhand);
					System.out.println("Your Hand = "+playerhand);
					
					if(dealerhand < playerhand && dealerhand < 17)
					{
						System.out.println("Dealer hits");
						dealerhand = dealerhand + dealerhit3;
						System.out.println("Dealer Hand = "+dealerhand);
						System.out.println("Your Hand = "+playerhand);
					}
				}
			}
			if(dealerhand > playerhand && dealerhand < 22)
			{
				System.out.println("Dealer wins");
			}
			if(playerhand > 21)
			{
				System.out.println("Dealer wins");
			}
			if(playerhand < 22 && playerhand > dealerhand)
			{
				System.out.println("You're win!!!");
			}
			if(dealerhand == playerhand)
			{
				System.out.println("Nobody wins");
			}
			if(dealerhand > 22)
			{
				System.out.println("You're win!");
			}
		}
	}
}
