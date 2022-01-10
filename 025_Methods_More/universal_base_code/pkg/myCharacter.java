package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String wizard = new String("wizard");
	public String rogue = new String("rogue");
	public String warrior = new String("warrior");
	public String role;
	public String roleassign;
	
	public int strength = 0;
	public int dexterity = 0;
	public int intelligence = 0;
	public int constitution = 0;
	public int charisma = 0;
	public String statsee;
	
	public myCharacter(String choice){
		role = choice;	
	}
	public String myToString(String statssee) {
		if(statssee.equals("Yes") || statssee.equals("yes") || statssee.equals("y") || statssee.equals("Y"))
			{
				System.out.println("Strength:"+strength+"\nDexterity:"+dexterity+"\nIntelligence:"+intelligence+"\nConstitution:"+constitution+"\nCharisma:"+charisma);
			}
		return statssee;
	}
	public String setRole(String r)
		{
			role = r;
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
				role = "no role";
			}
			roleassign = new String("Your role is "+role);
			return role;
		}
	public boolean setAll(String r, int s, int d, int i, int c, int ch)
		{
			setRole(r);
			strength = s;
			dexterity = d;
			intelligence = i;
			constitution = c;
			charisma = ch;
			if(role.equals("no role"))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	public int setStrength(int s)
		{
			strength = s;
			return strength;
		}
	public int setDexterity(int d)
		{
			dexterity = d;
			return dexterity;
		}
	public int setIntelligence(int i)
		{
			intelligence = i;
			return intelligence;
		}
	public int setConstitution(int c)
		{
			constitution = c;
			return constitution;
		}
	public int setCharisma(int ch)
		{
			charisma = ch;
			return ch;
		}
}

