package pkg;
import java.util.Scanner;
import java.util.Random;

public class myStats {
	Random rand1 = new Random();
	Random rand2 = new Random();
	Random rand3 = new Random();
	Random rand4 = new Random();
	Random rand5 = new Random();
	public int strength = rand1.nextInt(10);
	public int dexterity = rand2.nextInt(10);
	public int intelligence = rand3.nextInt(10);
	public int constitution = rand4.nextInt(10);
	public int charisma = rand5.nextInt(10);
	public String statsee;
	
	public myStats(String statssee){
		statsee = statssee;
		if(statsee.equals("yes") || statsee.equals("Yes"))
		{
			System.out.println("Strength:"+strength+"\nDexterity:"+dexterity+"\nIntelligence:"+intelligence+"\nConstitution:"+constitution+"\nCharisma:"+charisma);
		}
	}
	public myStats(){
		
	}
}
