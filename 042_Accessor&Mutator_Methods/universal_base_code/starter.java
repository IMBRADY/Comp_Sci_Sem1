import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter{
	
	public static void main(String args[]) {
	Dwarf[] gnome = new Dwarf[100];
	Dwarf acc = new Dwarf();
	Random rand = new Random();
	int num;
	for(int c = 0; c < gnome.length; c++)
	{
		gnome[c] = new Dwarf();
		num = rand.nextInt(7)+1;
		String nom = "";
		if(num == 1)
		{
			nom = "Grumpy";
		}
		if(num == 2)
		{
			nom = "Dopey";
		}
		if(num == 3)
		{
			nom = "Doc";
		}
		if(num == 4)
		{
			nom = "Happy";
		}
		if(num == 5)
		{
			nom = "Bashful";
		}
		if(num == 6)
		{
			nom = "Sneezy";
		}
		if(num == 7)
		{
			nom = "Sleepy";
		}
		gnome[c].setName(nom);
		gnome[c].setAge(rand.nextInt(100)+1);
	}
	for(int c = 0; c < gnome.length; c++)
	{
		String aa = gnome[c].getName();
		int ee = gnome[c].getAge();
		System.out.println(aa+" is "+ee+" years old");
	}
	}
}
