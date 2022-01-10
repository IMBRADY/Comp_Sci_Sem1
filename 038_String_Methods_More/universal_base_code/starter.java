import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your full name?");
		String name = sc.nextLine();
		int length = name.length();
		int c;
		for(c = 0; c < length; c++)
		{
			String letter = name.substring(c,c+1);
			if(letter.equals(" "))
			{
				break;
			}
		}
		System.out.println("Good morning Mr. or Mrs."+name.substring(c));
	}
}
