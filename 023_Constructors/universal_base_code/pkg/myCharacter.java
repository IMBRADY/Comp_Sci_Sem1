package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String wizard = new String("You chose wizard. How devious!");
	public String rogue = new String("You chose rogue. How cunning!");
	public String warrior = new String("You chose warrior. How noble!");
	public String role;
	public String norole;
	
	public myCharacter(String choice){
		role = choice;	
		if(role.equals("Wizard") || role.equals("wizard"))
			{
				System.out.println(wizard);
			}
		else if(role.equals("Warrior") || role.equals("warrior"))
			{
				System.out.println(warrior);
			}
		else if(role.equals("Rogue") || role.equals("rogue"))
			{
				System.out.println(rogue);
			}
		else
			{
				System.out.println("Try again");
				role = norole;
			}
	}
	public myCharacter(){
		
	}
}
