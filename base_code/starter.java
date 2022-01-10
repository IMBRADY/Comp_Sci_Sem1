import java.util.Scanner;
import java.util.Random;

class characters {
	String wizard = new String("wizard");
	String rogue = new String("rogue");
	String warrior = new String("warrior");
}
class stats {
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int constitution = 0;
	int charisma = 0;
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
	characters character = new characters();
	System.out.println(character.wizard);
	stats traits = new stats();
	System.out.println("Strength:"+traits.strength+"\nDexterity:"+traits.dexterity+"\nIntelligence:"+traits.intelligence+"\nConstitution:"+traits.constitution+"\nCharisma:"+traits.charisma);
	


		
	}
}
