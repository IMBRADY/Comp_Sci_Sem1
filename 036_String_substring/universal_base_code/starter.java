import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Word");
		String word = sc.nextLine();
		int c = 0;
		while(c < word.length())
		{
			System.out.print(word.substring(c,c+1)+"\t");
			c=c+1;
		}
		System.out.println();
		c = 0;
		while(c < word.length())
		{
			System.out.println(word.substring(c,c+1));
			c=c+1;
		}
	}
}
