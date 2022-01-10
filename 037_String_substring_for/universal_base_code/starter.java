import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Wurd?");
		String word = sc.nextLine();
		int length = word.length();
		for(int c = 0; c < length; c++)
		{
			System.out.print(word.substring(c,c+1)+" ");
		}
		System.out.println();
		for(int c = 0; c < length; c++)
		{
			System.out.print(word.substring(c,c+1)+"\n");
		}
	}
}
