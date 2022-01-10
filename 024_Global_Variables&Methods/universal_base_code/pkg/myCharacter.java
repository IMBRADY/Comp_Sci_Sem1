package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String wizard = new String("wizard");
	public String rogue = new String("rogue");
	public String warrior = new String("warrior");
	public String role;
	public String roleassign;
	
	public int strength = 4;
	public int dexterity = 6;
	public int intelligence = 7;
	public int constitution = 3;
	public int charisma = 2;
	public String statsee;
	
	public myCharacter(String choice){
		role = choice;	
		if(role.equals("Wizard") || role.equals("wizard"))
			{
				System.out.println("Your role is "+wizard);
				role = wizard;
			}
		else if(role.equals("Warrior") || role.equals("warrior"))
			{
				System.out.println("Your role is "+warrior);
				role = warrior;
			}
		else if(role.equals("Rogue") || role.equals("rogue"))
			{
				System.out.println("Your role is "+rogue);
				role = rogue;
			}
		else if((!(role.equals("Rogue"))) || (!(role.equals("rogue"))) || (!(role.equals("Warrior"))) || (!(role.equals("warrior"))) || (!(role.equals("Wizard"))) || (!(role.equals("wizard"))))
			{
				System.out.println("Try again");
			}
		roleassign = new String("You role is "+role);
	}
	public String myToString(String statssee) {
		if(statssee.equals("Yes") || statssee.equals("yes") || statssee.equals("y") || statssee.equals("Y"))
		{
		System.out.println(roleassign);
		System.out.println("Strength:"+strength+"\nDexterity:"+dexterity+"\nIntelligence:"+intelligence+"\nConstitution:"+constitution+"\nCharisma:"+charisma);
		}
	return statssee;
	}
}
