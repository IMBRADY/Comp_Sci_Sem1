import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x = 0;
		Random rand = new Random();
		int[] array;
		array = new int[100];
		while(true)
		{
			int randnum = rand.nextInt(1000);
			array[x] = randnum;
			System.out.print(array[x]+" ");
			if(x == 99)
			{
				break;
			}
			x=x+1;
		}
	}
}
