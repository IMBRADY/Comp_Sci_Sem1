import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int point = 0;
		int y = 1;
		int strength = 0;
		int dexterity = 0;
		int intelligence = 0;
		int constitution = 0;
		int charisma = 0;
		int givestrength;
		int givedexterity;
		int giveintelligence;
		int giveconstitution;
		int givecharisma;
		int x = 2;
		String type;
		System.out.println("Name your character.");
		String name = sc.nextLine();
		System.out.println("Choose a title. Ex:Eater of Worlds");
		String title = sc.nextLine();
		while(true)
		{
		System.out.println("Choose a type: warrior, wizard, rogue.");
		type = sc.nextLine();
		if(type.equals("wizard") || type.equals("Wizard"))
		{
			break;
		}
		if(type.equals("warrior") || type.equals("Warrior"))
		{
			break;
		}
		if(type.equals("rogue") || type.equals("Rogue"))
		{
			break;
		}
		else
		{
			System.out.println("Please choose again");
			
		}
		}
		if(x == 2)
		{	
			System.out.println("Hello, "+name+", "+title+", the "+type+". It is time to build your character");
			point = 25;
			while(true){
				System.out.println("You have "+point+" points left");
				System.out.println("Pick a value of strength from 1-10");
				givestrength = sc.nextInt();
				sc.nextLine();
				if(givestrength > 0 && givestrength < 11)
				{
					point = point-givestrength;
					strength = strength+givestrength;
					break;
				}
				else
				{
					System.out.println("Please try again");
					strength = 0;
					givestrength = 0;
				}
			}
			while(true){
					System.out.println("You have "+point+" points left");
					System.out.println("Pick a value of dexterity from 1-10");
					givedexterity = sc.nextInt();
					sc.nextLine();
				if(givedexterity > 0 && givedexterity < 11)
				{
					point = point-givedexterity;
					dexterity = dexterity+givedexterity;
					break;
				}
				else
				{
					System.out.println("Please try again");
					dexterity = 0;
					givedexterity = 0;
				}
			}
			while(true){
					System.out.println("You have "+point+" points left");
					System.out.println("Pick a value of intelligence from 1-10");
					giveintelligence = sc.nextInt();
					sc.nextLine();
				if(giveintelligence > 0 && giveintelligence < 11)
				{
					point = point-giveintelligence;
					intelligence = intelligence+giveintelligence;
					break;
				}
				else
				{	
					System.out.println("Please try again");
					intelligence = 0;
					giveintelligence = 0;
				}
			}
			while(true){
					System.out.println("You have "+point+" points left");
					System.out.println("Pick a value of constitution from 1-10");
					giveconstitution = sc.nextInt();
					sc.nextLine();
				if(giveconstitution > 0 && giveconstitution < 11)
				{
					point = point-giveconstitution;
					constitution = constitution+giveconstitution;
					break;
				}
				else
				{	
					System.out.println("Please try again");
					constitution = 0;
					giveconstitution= 0;
				}
			}
			while(true){
					System.out.println("You have "+point+" points left");
					System.out.println("Pick a value of charisma from 1-10");
					givecharisma = sc.nextInt();
					sc.nextLine();
				if(givecharisma > 0 && givecharisma < 11)
				{
					point = point-givecharisma;
					charisma = charisma+givecharisma;
					y=0;
					break;
				}
				else
				{	
					System.out.println("Please try again");
					charisma = 0;
					givecharisma = 0;
				}
			}
		}
			if(point < 0)
				{
					System.out.println("You exceded 25 points. Now die");
					x = x-1;
				}
				if(y == 0)
				{
				System.out.println("Hello, "+name+", "+title+", the "+type);
				System.out.println("strength = "+strength);
				System.out.println("dexterity = "+dexterity);
				System.out.println("intelligence = "+intelligence);
				System.out.println("constitution = "+constitution);
				System.out.println("charisma = "+charisma);
				}
			}
		}