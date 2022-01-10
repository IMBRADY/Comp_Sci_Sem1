import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int counter = 0;
		int[] array;
		array = new int[1000];
		while(counter < array.length)
		{
			array[counter] = rand.nextInt(10000);
			counter = counter+1;
		}
		counter = 0;
		while(counter < array.length)
		{
			System.out.print("Mr. Poole variant "+array[counter]+" ");
			counter = counter+1;
		}
	}
}
