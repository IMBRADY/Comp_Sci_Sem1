import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	}
	public int getMode(int[] array)
	{
		int[] count = new int[array.length];
		int ooga = 0;
		int findmax = 0;
		int findmaxagan = 0;
		int y = 0;
		for(int c = 0; c < array.length; c++)
		{
			if(array[c] > findmax)
			{
				findmax = array[c];
			}
		}
		for(int i = 0; i < findmax; c++)
		{
			for(int c = 0; c < array.length; c++)
			{
				if(array[c] == i)
				{
					ooga = ooga+1;
				}
			}
			count[i] = ooga;
		}
		for(y = 0; c < array.length; y++)
		{
			if(ooga[c] > findmaxagan)
			{
				findmaxagan = y;
			}
		}
		if(y == 0)
		{
			y = -1;
		}
		return y;
	}
	public int getMedian(int[] array)
	{
		int toters = 0;
		int median;
		for(int c = 0; c < array.length; c++)
		{
			toters = toters+array[c];
		}
		median = toters/array.length;
		return median;
	}
}
