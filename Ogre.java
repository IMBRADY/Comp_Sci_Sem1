package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public String name;
	public boolean ugly = true;

	public Ogre() {
		name = "Shrek";
		boolean ugly = true;
	}

	private String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	public void interact(Donkey donkey){
		System.out.println(donkey.name + ", what are you doing in my swamp?!");
		return;
	}


}
