package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	Random rand = new Random();
	public String name;
	public int health;
	public int attack;
	public int dmg;

	public BaseClass() 
	{
		name = "";
		health = rand.nextInt(15)+1;
		attack = rand.nextInt(15)+1;
	}
	public BaseClass(String a)
	{
		name = a;
	}
	public void setHealth(int a)
	{
		health = a;
	}
	public int getHealth()
	{
		return health;
	}
	public String getName()
	{
		return name;
	}
	public void attack(Warrior w)
	{
		 int dmg = rand.nextInt(attack)+1;
		 health = w.getHealth();
		 health = health-dmg;
	}
	public void attack(Wizard w)
	{
		int dmg = rand.nextInt(attack)+1;
		health = w.getHealth();
		health = health-dmg;
	}
}

