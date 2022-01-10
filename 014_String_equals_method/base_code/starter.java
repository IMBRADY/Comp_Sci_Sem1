import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Would you like to be a wizard, warrior, or a rogue?");
		String pick = sc.nextLine();
		if(pick.equals("wizard"))
		{
			System.out.println("You chose wizard. What a pathetic choice");
		}
		if(pick.equals("warrior"))
		{
			System.out.println("You chose warrior, what a basic choice");
		}
		if(pick.equals("rogue"))
		{
			System.out.println("You chose rogue, what an authentic choice");
		}
		else
		{
			System.out.println("Please answer the question");
		}
	}
}
