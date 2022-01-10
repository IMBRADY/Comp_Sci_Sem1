import java.util.Scanner;
import java.util.Random;

class homework {
	public static void main(String args[]) {
	int[] array = new int[20];
	int[] arraytwo = new int[20];
	Random rand = new Random();
		for(int c = 0; c < array.length; c++)
		{
			array[c] = rand.nextInt(50)+1;
			System.out.print(array[c]+" ");
		}
	System.out.println("");
		for(int c = 1; c < arraytwo.length; c++)
		{
			arraytwo[c] = array[20-c];
			System.out.print(arraytwo[c]+" ");
		}
	arraytwo[19] = array[0];
	System.out.print(arraytwo[19]);
	}
}
