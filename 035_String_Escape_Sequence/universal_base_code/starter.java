import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	static int c;
	static int soccred = 0;
	static int a;
	static int num;
	static int check;
	static int usednum1;
	static int usednum2;
	static boolean [] used = new boolean[4];
	static Random rand = new Random();
	public static void main(String args[]) {
		// Your code goes below here
		while(c < used.length)
		{
			used[c] = false;
			c = c+1;
		}
		Scanner sc = new Scanner(System.in);
		num = rand.nextInt(4);
		usednum1 = num;
		String funone = insultList(num);
		while(usednum1 == num)
		{
			num = rand.nextInt(4);
		}
		usednum2 = num;
		String funtwo = insultList(num);
		while(usednum1 == num || usednum2 == num)
		{
			num = rand.nextInt(4);
		}
		String funthree = insultList(num);
		System.out.println("| Please do not harrass the bot. It has feelings too and has had a very bad day |");
		System.out.println("Hello user! What is your name?");
		String name = sc.nextLine();
		System.out.println("I've recognized \""+name+"\" to be in the same category as \n"+funone+"\n"+funtwo+"\n"+funthree);
		while(true)
		{
			System.out.println("Is this information correct? | Yes | | No |");
			String ans = sc.nextLine();
			if(ans.equals("no") || ans.equals("No"))
			{
				int num1 = 50+rand.nextInt(50);
				int num2 = 2+rand.nextInt(16);
				System.out.println("This flawless machine cannot be incorrect");
				System.out.println("It appears my intelligence level is that of\n"+num1+"\nand your IQ is\n"+num2);
				break;
			}
			else if(ans.equals("yes") || ans.equals("Yes"))
			{
				num = 1+rand.nextInt(5);
				soccred = num;
				System.out.println("Amazing!");
				System.out.println("Bot is pleased. Social credit raised by"+num);
				System.out.println("Social Credit:\t"+num);
				break;
			}
			else
			{
				while(true)
				{
					c = 0;
					System.out.print("Is this information correct? ");
					if(c > 15)
					{
						break;
					}
					c=c+1;
				}
			}
		}
		while(true)
		{
			System.out.println("On a scale of 0 to 10, how much do you enjoy this bot?");
			int rate = sc.nextInt();
			sc.nextLine();
			if(rate < 3)
			{
				System.out.println("Sorry. I didn't understand that answer");
			}
			if(rate > 2 && rate < 10)
			{
				while(true)
				{
					System.out.println("Did you mean 10? | Yes |");
					String minirate = sc.nextLine();
					if(minirate.equals("yes") || minirate.equals("Yes"))
					{
						break;
					}
				}
				break;
			}
			if(rate == 10)
			{
				num = 1+rand.nextInt(5);
				soccred = soccred+num;
				System.out.println("Congradulations! \nYour social credit is now "+soccred);
			}
		}
	}
	public static String insultList(int a)
	{
		num = a;
		String funny = new String();
		if(num == 0 && used[0] == false)
		{
			funny = "classified monkey cases";
			used[0] = true;
		}
		if(num == 1 && used[1] == false)
		{
			funny = "brown parts of the banana";
			used[1] = true;
		}
		if(num == 2 && used[2] == false)
		{
			funny = "people that shouldn't exist";
			used[2] = true;
		}
		if(num == 3 && used[3] == false)
		{
			funny = "top 10 least fresh cuts";
			used[3] = true;
		}
		else if(num == 4 && used[4] == false)
		{
			funny = "fakers";
			used[4] = true;
		}
		return funny;
	}
}