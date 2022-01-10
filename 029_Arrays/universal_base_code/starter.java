import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x = 0;
		int[] array;
		array = new int[10];
		array[0]=9;
		array[1]=8;
		array[2]=7;
		array[3]=6;
		array[4]=5;
		array[5]=4;
		array[6]=3;
		array[7]=2;
		array[8]=1;
		array[9]=0;
		while(true)
		{
			System.out.println(array[x]);
			if(x == 9)
			{
				break;
			}
			x=x+1;
		}
	}
}
