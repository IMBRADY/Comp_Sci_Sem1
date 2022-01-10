import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String a = new String();
		String name = new String();
		int times;
	Ascii Human = new Ascii();
	Ascii Dog = new Ascii();
	Ascii Cactus = new Ascii();
	Ascii Other = new Ascii();	
	Ascii Funny = new Ascii();
	Scanner sc = new Scanner(System.in);
	System.out.println("What type of Ascii do you want to print?");
	a = sc.nextLine();
	System.out.println("What is the name of the Ascii?");
	name = sc.nextLine();
	System.out.println("How many times are you printing it");
	times = sc.nextInt();
		if(a.equals("human") || a.equals("Human")){
			Human.setType(a);
			Human.setName(name);
			Human.setNumber(times);
			Human.printArt();
		}
		else if(a.equals("dog") || a.equals("Dog")){
			Dog.setType(a);
			Dog.setName(name);
			Dog.setNumber(times);
			Dog.printArt();
		}
		else if(a.equals("cactus") || a.equals("Cactus")){
			Cactus.setType(a);
			Cactus.setName(name);
			Cactus.setNumber(times);
			Cactus.printArt();
		}
		else if(a.equals("other") || a.equals("Other")){
			Other.setType(a);
			Other.setName(name);
			Other.setNumber(times);
			Other.printArt();
		}
		else if(a.equals("funny") || a.equals("Funny")){
			Funny.setType(a);
			Funny.setName(name);
			Funny.setNumber(times);
			Funny.printArt();
		}
		else{
			Human.setType(a);
			Human.setName(name);
			Human.setNumber(times);
			Human.printArt();
		}
	sc.nextLine();
	}
}
