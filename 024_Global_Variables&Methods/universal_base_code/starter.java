import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a role: Wizard, Warrior, Rogue");
		String role = sc.nextLine();
		myCharacter bob = new myCharacter(role);
		System.out.println("Would you like to see your character?");
		String statssee = sc.nextLine();
		//new myCharacter(statssee);
		bob.myToString(statssee);
	}	
}
