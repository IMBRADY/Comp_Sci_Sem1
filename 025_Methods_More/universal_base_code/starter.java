import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a role: Wizard, Warrior, Rogue");
		String role = sc.nextLine();
		myCharacter bob = new myCharacter(role);
		bob.setRole(role);
		System.out.println("Would you like to see your character?");
		String statssee = sc.nextLine();
		bob.setAll(role,5,4,3,5,6);
		bob.myToString(statssee);
	}	
}
