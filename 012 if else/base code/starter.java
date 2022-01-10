import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand1 = rand.nextInt(1000);
		int rand2 = 1;
		int randnum = rand1+rand2;
		System.out.println("I'm thinking of a number from 1 to 1000. Can you guess it?");
		int value = sc.nextInt();
		sc.nextLine();
		if(value == randnum){
			System.out.println("You guessed my number! It was "+randnum);
		}
		else
		{
			System.out.println("So close, my number was "+randnum);
		}
	}
}
