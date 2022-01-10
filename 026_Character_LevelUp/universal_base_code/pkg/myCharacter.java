package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	Scanner sc = new Scanner(System.in);
	public String wizard = new String("wizard");
	public String rogue = new String("rogue");
	public String warrior = new String("warrior");
	public String role;
	public String roleassign;
	
	int points = 0;
	int level = 0;
	int strengthadd;
	int dexterityadd;
	int intelligenceadd;
	int constitutionadd;
	int charismaadd;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
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
	public void levelUp(int s, int d, int i, int c, int ch)
		{	
			if(level == 0)
			{
				points = 25;
			}
			if(level > 0)
			{
				points = 10;
				System.out.println("LEVEL UP");
				System.out.println("You are now level "+level);
			}
				strengthadd = 0;
				dexterityadd = 0;
				intelligenceadd = 0;
				constitutionadd = 0;
				charismaadd = 0;
				strength = s;
				dexterity = d;
				intelligence = i;
				constitution = c;
				charisma = ch;
				while(true) 
				{
					System.out.println("You have "+points+" points. Which category would you like to add your points to?");
					System.out.println("Strength | Dexterity | Intelligence | Constitution | Charisma");
					String pointdecision = sc.nextLine();
					if(pointdecision.equals("strength") || pointdecision.equals("Strength") || pointdecision.equals("s") || pointdecision.equals("S"))
					{
						while(true)
						{
							System.out.println("How many points would you like to add to strength?");
							strengthadd = sc.nextInt();
							sc.nextLine();
							if(checkPoints(strengthadd))
							{
								setStrength(strength+strengthadd);
								points = points-strengthadd;
								pointdecision = "true";
								break;
							}
							System.out.println("Insufficient value, try again");
							strengthadd = 0;
						}
					}
					if(pointdecision.equals("dexterity") || pointdecision.equals("Dexterity") || pointdecision.equals("d") || pointdecision.equals("D"))
					{
						while(true)
						{
							System.out.println("How many points would you like to add to dexterity?");
							dexterityadd = sc.nextInt();
							sc.nextLine();
							if(checkPoints(dexterityadd))
							{
								setDexterity(dexterity+dexterityadd);
								points = points-dexterityadd;
								pointdecision = "true";
								break;
							}
							System.out.println("Insufficient value, try again");
							dexterityadd = 0;
						}
					}
					if(pointdecision.equals("intelligence") || pointdecision.equals("Intelligence") || pointdecision.equals("i") || pointdecision.equals("I"))
					{
						while(true)
						{
							System.out.println("How many points would you like to add to intelligence?");
							intelligenceadd = sc.nextInt();
							sc.nextLine();
							if(checkPoints(intelligenceadd))
							{
								setIntelligence(intelligence+intelligenceadd);
								points = points-intelligenceadd;
								pointdecision = "true";
								break;
							}
							System.out.println("Insufficient value, try again");
							intelligenceadd = 0;
						}
					}
					if(pointdecision.equals("constitution") || pointdecision.equals("Constitution") || pointdecision.equals("c") || pointdecision.equals("C"))
					{
						while(true)
						{
							System.out.println("How many points would you like to add to constitution?");
							constitutionadd = sc.nextInt();
							sc.nextLine();
							if(checkPoints(constitutionadd))
							{
								setConstitution(constitution+constitutionadd);
								points = points-constitutionadd;
								pointdecision = "true";
								break;
							}
							System.out.println("Insufficient value, try again");
							constitutionadd = 0;
						}
					}
					if(pointdecision.equals("charisma") || pointdecision.equals("Charisma") || pointdecision.equals("ch") || pointdecision.equals("Ch"))
					{
						while(true)
						{
							System.out.println("How many points would you like to add to charisma?");
							charismaadd = sc.nextInt();
							sc.nextLine();
							if(checkPoints(charisma))
							{
								setCharisma(charisma+charismaadd);
								points = points-charismaadd;
								pointdecision = "true";
								break;
							}
							System.out.println("Insufficient value, try again");
							charismaadd = 0;
						}
					}
					if(!(pointdecision == "true"))
					{
						System.out.println("Please try again");
					}
					if(points == 0)
					{
						break;
					}
				}
				System.out.println("You have fully expended your points");
				System.out.println("Strength: "+strength+" (+"+strengthadd+")");
				System.out.println("Dexterity: "+dexterity+" (+"+dexterityadd+")");
				System.out.println("Intelligence: "+intelligence+" (+"+intelligenceadd+")");
				System.out.println("Constitution: "+constitution+" (+"+constitutionadd+")");
				System.out.println("Charisma: "+charisma+" (+"+charismaadd+")");
			level = level+1;
		}
	public boolean checkPoints(int num)
		{
			if(num < 0 && num > 10)
			{
				return false;
			}
			if(num > points)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	private int setStrength(int s)
		{
			strength = s;
			return strength;
		}
	private int setDexterity(int d)
		{
			dexterity = d;
			return dexterity;
		}
	private int setIntelligence(int i)
		{
			intelligence = i;
			return intelligence;
		}
	private int setConstitution(int c)
		{
			constitution = c;
			return constitution;
		}
	private int setCharisma(int ch)
		{
			charisma = ch;
			return ch;
		}
}

