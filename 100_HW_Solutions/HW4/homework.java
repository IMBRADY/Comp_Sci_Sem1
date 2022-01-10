import java.util.Scanner;
import java.util.Random;

class homework {
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Yo whats a cool numbah g?");
		int numbah1 = sc.nextInt();
		System.out.println("Gimme anotha numbah");
		int numbah2 = sc.nextInt();
		if((numbah1%2) == 0)
			{
				System.out.println("Da first numbah is even");
			}
		else
			{
				System.out.println("Da first numbah is odd");
			}
			if((numbah1%3) == 0)
				{
					System.out.println("Da first numbah is divisble bah 3");
				}
			if((numbah1%4) == 0)
				{
					System.out.println("Da first numbah is divisble bah 4");
				}
			if((numbah1%5) == 0)
				{
					System.out.println("Da first numbah is divisble bah 5");
				}
			if((numbah1%3) != 0)
				{
					System.out.println("Da first numbah is not divisble bah 3");
				}
			if((numbah1%4) != 0)
				{
					System.out.println("Da first numbah is not divisble bah 4");
				}
			if((numbah1%5) != 0)
				{
					System.out.println("Da first numbah is not divisble bah 5");
				}
		if((numbah2%2) == 0)
			{
				System.out.println("Da second numbah is even");
			}
		else
			{
				System.out.println("Da second numbah is odd");
			}
			if((numbah2%3) == 0)
				{
					System.out.println("Da second numbah is divisble bah 3");
				}
			if((numbah2%4) == 0)
				{
					System.out.println("Da second numbah is divisble bah 4");
				}
			if((numbah2%5) == 0)
				{
					System.out.println("Da second numbah is divisble bah 5");
				}
			if((numbah2%3) != 0)
				{
					System.out.println("Da second numbah is not divisble bah 3");
				}
			if((numbah2%4) != 0)
				{
					System.out.println("Da second numbah is not divisble bah 4");
				}
			if((numbah2%5) != 0)
				{
					System.out.println("Da second numbah is not divisble bah 5");
				}
	}
}
