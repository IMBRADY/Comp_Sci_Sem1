import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("cat nAme?");
		String name = sc.nextLine();
		Cat meow = new Cat(name);
		meow.meow();
		Cat moof = new Cat("Garfielf");
		moof.meow();
	}
}
