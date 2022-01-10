import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int findmax;
		int findmin;
		int findavg;
		Random rand = new Random();
		BaseClass test = new BaseClass();
		int[] array;
		array = new int[100];
		toStringArray(array);
		findavg = getArrayAverage(array);
		findmax = getArrayMax(array);
		findmin = getArrayMin(array);
		System.out.println();
		System.out.println("Maximum: "+findmax);
		System.out.println("Minimum: "+findmin);
		System.out.println("Average: "+findavg);
	}
	public static void toStringArray(int [] array)
	{
		Random rand = new Random();
		int c = 0;
		int x;
		while(c < array.length)
		{
			x = rand.nextInt(100)+1;
			array[c]=x;
			System.out.print(array[c]+" ");
			c = c+1;
		}
	}
	public static int getArrayAverage(int [] array)
	{
		Random rand = new Random();
		int c = 0;
		int all = 0;
		int result;
		while(c < array.length)
		{
			all=all+array[c];
			c=c+1;
		}
		result=all/array.length;
		return result;
	}
	public static int getArrayMax(int [] array)
	{
		int c = 0;
		int max = 0;
		while(c < array.length)
		{
			if(array[c] > max)
			{
				max = array[c];
			}
			c=c+1;
		}
		return max;
	}
	public static int getArrayMin(int [] array)
	{
		int c = 0;
		int min = 1000;
		while(c < array.length)
		{
			if(array[c] < min)
			{
				min = array[c];
			}
			c=c+1;
		}
		return min;
	}
}
