import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand1 = rand.nextInt(1000);
		int rand2 = 1;
		int randnum = rand1+rand2;
		System.out.println("I'm thinking of a number from 1 to 1000. Can you guess it?");
		int value = sc.nextInt();
		sc.nextLine();
		if(value == randnum){
			System.out.println("You guessed my number! It was "+randnum);
		}
		else if(value > randnum){
			System.out.println("My number is lower");
		}
		else if(value < randnum){
			System.out.println("My number is higher");
		}
		int value2 = sc.nextInt();
		sc.nextLine();
		if(value2 == randnum){
			System.out.println("You guessed my number! It was "+randnum);
		}
		else if(value2 > randnum){
			System.out.println("My number is lower");
		}
		else if (value2 < randnum){
			System.out.println("My number is higher");
		}
		int value3 = sc.nextInt();
		sc.nextLine();
		if(value3 == randnum){
			System.out.println("You guessed my number! It was "+randnum);
		}
		else if(value3 > randnum){
			System.out.println("My number is lower");
		}
		else if (value3 < randnum){
			System.out.println("My number is higher");
		}
		int value5 = sc.nextInt();
		sc.nextLine();
		if(value5 == randnum){
			System.out.println("You guessed my number! It was "+randnum);
		}
		else if(value5 > randnum){
			System.out.println("My number is lower");
		}
		else if (value5 < randnum){
			System.out.println("My number is higher");
		}
		int value6 = sc.nextInt();
		sc.nextLine();
		if(value6 == randnum){
			System.out.println("You guessed my number! It was "+randnum);
		}
		else if(value6 > randnum){
			System.out.println("My number is lower");
		}
		else if (value6 < randnum){
			System.out.println("My number is higher");
		}
		int value7 = sc.nextInt();
		sc.nextLine();
		if(value7 == randnum){
			System.out.println("You guessed my number! It was "+randnum);
		}
		else if(value7 > randnum){
			System.out.println("My number is lower");
			System.out.println("You're really bad at this");
		}
		else if (value7 < randnum){
			System.out.println("My number is higher");
			System.out.println("You're really bad at this");
		}
	}
}
