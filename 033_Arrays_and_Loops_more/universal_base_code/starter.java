import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand1 = new Random();
		Random rand2 = new Random();
		int poop = 51+rand1.nextInt(150);
		int counter = 0;
		int findmin = 100;
		int findmax = 0;
		int findavg = 0;
		int[] array;
		array = new int[poop];
		while(counter < array.length)
		{
			array[counter] = 1+rand1.nextInt(100);
			System.out.print(array[counter]+" ");
			counter = counter+1;
		}
		System.out.println();
		System.out.println("Total Numbers: "+array.length);
		counter = 0;
		while(counter < array.length)
		{
			if(array[counter] < findmin)
			{
				findmin = array[counter];
		}
			counter=counter+1;
		}
		System.out.println("Minimum: "+findmin);
		counter = 0;
		while(counter < array.length)
		{
			if(array[counter] > findmax)
			{
				findmax = array[counter];
			}
			counter=counter+1;
		}
		System.out.println("Maximum: "+findmax);
		counter = 0;
		while(counter < array.length)
		{
			findavg = findavg+array[counter];
			counter = counter+1;
		}
		findavg = findavg/array.length;
		System.out.println("Average: "+findavg);
	}
}
