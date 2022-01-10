import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static Wizard[] x = new Wizard[100];
	public static Warrior[] y = new Warrior[100]; 
	public static Random rand = new Random();
	public static void main(String args[]) {
		// Your code goes below here
	int wizgone = 0;
	int wargone = 0;
	Warrior war = new Warrior();
	Wizard wiz = new Wizard();
	boolean[] wizcheck = new boolean[100];
	boolean[] warcheck = new boolean[100];
		for(int c = 0; c < 100; c++)
		{
			x[c] = new Wizard();	
		}
		for(int c = 0; c < 100; c++)
		{
			y[c] = new Warrior();	
		}
		for(int c = 0; c < 100; c++)
		{
			wizcheck[c] = false;	
		}
		for(int c = 0; c < 100; c++)
		{
			warcheck[c] = false;	
		}
		for(int c = 0; c < 100; c++)
		{
			int attwar = rand.nextInt(100);
			if(attwar == 101)
				{
					attwar = 0;
				}
			while(y[attwar].isDead() == true)
			{
				attwar = attwar+1;
			}
			x[c].attack(y[attwar]);
			for(int i = 0; i < 100; i++)
			{
				if(x[i].isDead() == true)
				{
					wizcheck[i] = true;
				}
				else
				{
					wizcheck[i] = false;
				}
			}
			int attwiz = rand.nextInt(100);
				if(attwiz == 101)
				{
					attwiz = 0;
				}
			while(y[attwiz].isDead() == true)
			{
				attwiz = attwiz+1;
			}
			y[c].attack(x[attwiz]);
			for(int i = 0; i < 100; i++)
			{
				if(y[i].isDead() == true)
				{
					warcheck[i] = true;
				}
				else
				{
					warcheck[i] = false;
				}
			}
			for(int i = 0; i < 100; i++)
			{
				wizgone = 0;
				wargone = 0;
				if(x[i].isDead() == true)
				{
					wizcheck[i] = true;
				}
				else
				{
					wizcheck[i] = false;
					wizgone = 1;
				}
				wargone = 0;
				if(y[i].isDead() == true)
				{
					warcheck[i] = true;
				}
				else
				{
					warcheck[i] = false;
					wargone = 1;
				}
			}
			if(wargone != 1)
			{
				wizEnd("wizards");
				break;
			}
			if(wizgone != 1)
			{
				warEnd("warriors");
				break;
			}
		}
	}
	public static void warEnd(String a)
	{
		System.out.println("The "+a+" have won!");
		int check = 0;
		for(int c = 0; c < 100; c++)
		{
			if(y[c].isDead() == false)
			{
				check = check+1;
			}
		}
		System.out.println("There are "+check+" "+a+" left");
	}
	public static void wizEnd(String a)
	{
		System.out.println("The "+a+" have won!");
		int check = 0;
		for(int c = 0; c < 100; c++)
		{
			if(x[c].isDead() == false) 
			{
				check = check+1;
			}
		}
		System.out.println("There are "+check+" "+a+" left");
	}
}
