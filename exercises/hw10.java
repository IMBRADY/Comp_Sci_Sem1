import java.util.Scanner;
import java.util.Random;


class hw10 {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] array = new int[20];
		int i = 1;
		int c = 0;
		int count = 0;
		for(c = 0; c < array.length; c++)
		{
			array[c] = rand.nextInt(10)+1;
			System.out.print(array[c]+" ");
		}
		System.out.println("");
		for(i = 1; i < array.length; i++)
		{
			count = 0;
			for(int c2 = 0; c2 < array.length; c2++)
			{
				if(array[c2] == i)
				{
					count = count+1;
					if(count > 1)
					{
						count = 0;
						System.out.println("Anomoly at number "+(c2+1)+" of "+i);
					}
				}
			}
		}
		for(c = 0; c < array.length-1; c++)
		{
			if(array[c] == array[c+1])
			{
				System.out.println("Consecutive at number "+(c+1)+" of "+array[c]);
			}
		}
	}
}
