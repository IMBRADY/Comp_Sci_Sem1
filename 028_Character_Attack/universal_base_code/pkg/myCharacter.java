package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	Random rand1 = new Random();
	Random rand2 = new Random();
	Random rand3 = new Random();
	Random rand4 = new Random();
	Random rand5 = new Random();
	int randnum1 = rand1.nextInt(3)+1;
	int randnum2 = rand2.nextInt(4)+1;
	int randnum3 = rand3.nextInt(6)+1;
	int randnum4;
	int randnum5;
	Scanner sc = new Scanner(System.in);
	public String wizard = new String("wizard");
	public String rogue = new String("rogue");
	public String warrior = new String("warrior");
	public String role;
	public String roleassign;
	public int maxHealth = 0;
	public int currentHealth = 0;
	public int sethp;
	public int maxhp;
	public int xp = 0;
	public int xpreq = 0;
	
	int attackModifier;
	int inchp = 0;
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
	//Worldly
	
	//Worldly
	public void firstLevel()
	{
		System.out.println("A goblin approaches!");
		
	}
	//Other
	
	//Other
	public void ansOne(String aone)
	{
		while(true)
		{
			if(aone.equals("yes") || aone.equals("Yes") || aone.equals("YES") || aone.equals("y") || aone.equals("Y"))
			{
				firstLevel();
				break;
			}
			if(aone.equals("no") || aone.equals("No") || aone.equals("NO") || aone.equals("n") || aone.equals("N"))
			{
				System.out.println("Answer taken");
				setAll(role,strength,dexterity,intelligence,constitution,charisma);
			}
			else
			{
				System.out.println("Please try again");
			}
		}
		
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
	//Damage
	
	//Damage
	public void takeDamage(int dmg)
	{
		if(dmg > currentHealth || dmg == currentHealth)
		{
			currentHealth = 0;
			System.out.println("You are dead");
		}
		else
		{
			currentHealth = currentHealth-dmg;
			System.out.println("You took "+dmg+" damage!");
			System.out.println("Health: "+currentHealth+" | "+maxHealth);
		}
	}
	public boolean isDead()
	{
		if(currentHealth == 0)
		{
			System.out.println("You are dead");
			return true;
		}
		if(currentHealth != 0)
		{
			return false;
		}
		else
		{
			return false;
		}
	}
	public void setAttackMod()
	{
		if(role.equals(wizard))
		{
			randnum5 = rand5.nextInt(strength)+1;
			if(strength != 0)
			{
				attackModifier = 2+randnum5;
			}
			else
			{
				attackModifier = 2;
			}
		}
		if(role.equals(rogue))
		{
			randnum5 = rand5.nextInt(intelligence)+1;
			if(intelligence != 0)
			{
				attackModifier = 2+randnum5;
			}
			else
			{
				attackModifier = 2;
			}
		}
		if(role.equals(warrior))
		{
			randnum5 = rand5.nextInt(dexterity)+1;
			if(dexterity != 0)
			{
				attackModifier = 2+randnum5;
			}
			else
			{
				attackModifier = 2;
			}
		}
		if(role.equals("no role"))
		{
			attackModifier = 2;
		}
		System.out.println("You dealt "+attackModifier+" damage!");
	}
	//Health
	
	//Health
	public int getHealth()
	{
		currentHealth = currentHealth;
		return currentHealth;
	}
	public void setHealth(int curhp)
	{
		curhp = currentHealth;
		System.out.println("Health: "+currentHealth+" | "+maxHealth);
	}
	public void setMaxHealth()
	{
		if(role.equals(wizard))
		{
			maxHealth = constitution+randnum1+inchp;
			currentHealth = maxHealth;
			setHealth(maxHealth);
		}
		if(role.equals(rogue))
		{
			maxHealth = constitution+randnum2+inchp;
			currentHealth = maxHealth;
			setHealth(maxHealth);
		}
		if(role.equals(warrior))
		{
			maxHealth = constitution+randnum3+inchp;
			currentHealth = maxHealth;
			setHealth(maxHealth);
		}
		if(role.equals("no role"))
		{
			maxhp = constitution;
			currentHealth = maxHealth;
			setHealth(maxHealth);
		}
		System.out.println("Your Maximum Health is "+maxHealth);
	}
	//Roles and Stats
	
	//Roles and Stats
	public myCharacter(String choice){
		role = choice;	
	}
	public String myToString(String statssee) 
	{
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
			//setRole(r);
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
	//Level Up
	
	//Level Up
	public void xpPercent(int ex)
	{
		xp = ex+xp;
		while(true)
		{
			xpreq = 10*(1+level);
			if(xpreq < xp || xpreq == xp)
			{
				xp = xp-xpreq;
				levelUp(strength,dexterity,intelligence,constitution,charisma);
				ex = 0;
			}
			else if(xpreq > xp)
			{
				break;
			}
		}
	}
	public void levelUp(int s, int d, int i, int c, int ch)
		{	
			if(level == 0)
			{
				points = 25;
				sethp = 1;
				setMaxHealth();
			}
			if(level > 0)
			{
				points = 10;
				System.out.println("LEVEL UP");
				System.out.println("You are now level "+level);
				randnum4 = rand4.nextInt(10)+1;
				if(randnum4 != 10)
				{
					inchp = inchp+1;
				}
				setMaxHealth();
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
				if(sethp == 1)
					{
						maxHealth = constitution;
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
}

