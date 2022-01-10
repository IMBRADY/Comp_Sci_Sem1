import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter{
	public static Dwarf[] gnome = new Dwarf[100];
	public static Dwarf acc = new Dwarf();
	public static void main(String args[]) {
	Random rand = new Random();
	int num;
	int repeat = 0;
	boolean fruse;
	String screeb = "";
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
		if(c == 0)
		{
			gnome[c].setName(nom);
			screeb = gnome[c].getName();
			acc.isSameNameCheck(screeb);
		}
		else if(c != 0)
		{
			gnome[c].setName(nom);
			gnome[c].setAge(rand.nextInt(100)+1);
			String scoob = gnome[c].getName();
			fruse = acc.isSameName(screeb,scoob);
			if(fruse == true)
			{
				repeat = repeat + 1;
			}
		}
	}
	for(int c = 0; c < gnome.length; c++)
	{
		String aa = gnome[c].getName();
		int ee = gnome[c].getAge();
		System.out.println(aa+" is "+ee+" years old");
	}
	System.out.println("There are "+repeat+" repeats");
	}
}
