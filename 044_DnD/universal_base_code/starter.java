import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Warrior[] war = new Warrior[1];
		Wizard[] wiz = new Wizard[1];
		System.out.println("Name your character");
		String name = sc.nextLine();
		BaseClass test = new BaseClass(name);
		
		
		Random rand = new Random();
		rand.nextInt(11);
	}
}
