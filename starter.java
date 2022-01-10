import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int number = 1;
		int rand1 = rand.nextInt(3);
		int rand2 = rand.nextInt(3);
		int x = rand1+number;
		int y = rand2+number;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		boolean bigx = x>y;
		if(bigx)
		{
			System.out.println("x is greater than y");
		}
		boolean bigy = y>x;
		if(bigy)
		{
			System.out.println("y is greater than x");
		}
		boolean equxy = x==y;
		if(equxy)
		{
			System.out.println("x is equal to y");
		}
	}
}
