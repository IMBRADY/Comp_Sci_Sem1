
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;


class starter {
	static Random rand = new Random();
	static int arraylength = rand.nextInt(30)+10;
	static int arraylengthtwo = rand.nextInt(30)+20;
	static int arraylengththree = 26;
	public static void main(String args[]) {
		// Your code goes below here
		int findmax;
		int findmin;
		int findavg;
		int[] array = new int[arraylength];
		int[] arraytwo = new int[arraylengthtwo];
		String[] arraythree = new String[26];
		int[] arraynum = new int[26];
		int c;
		System.out.println("Array of numbers from 10 to 59");
		wait(500);
		for(c = 0; c < array.length; c++)
		{
			array[c] = rand.nextInt(50)+10;
			System.out.print(array[c]+" ");
			wait(20);
		}
		System.out.println("");
		System.out.println("Statistics:");
		wait(500);
		findmax = getMax(array);
		System.out.println("Maximum: "+findmax);
		wait(500);
		findmin = getMin(array);
		System.out.println("Minimum: "+findmin);
		wait(500);
		findavg = getAvg(array);
		System.out.println("Average: "+findavg);
		wait(500);
		System.out.println("Total: "+arraylength);
		boolean amog = false;
		while(true)
		{
			System.out.println("");
			sortAlg(array);
			amog = checkAlg(array);
			if(amog == true)
			{
				break;
			}
		}
		System.out.println("");
		System.out.println("Complete!");
		wait(2000);
		System.out.println("Array of numbers from 0 to 9");
		wait(500);
		for(c = 0; c < arraytwo.length; c++)
		{
			arraytwo[c] = rand.nextInt(10);
			System.out.print(arraytwo[c]);
			wait(20);
		}
		System.out.println("");
		System.out.println("Statistics:");
		wait(500);
		findmax = getMax(arraytwo);
		System.out.println("Maximum: "+findmax);
		wait(500);
		findmin = getMin(arraytwo);
		System.out.println("Minimum: "+findmin);
		wait(500);
		findavg = getAvg(arraytwo);
		System.out.println("Average: "+findavg);
		wait(500);
		System.out.println("Total: "+arraylengthtwo);
		amog = false;
		while(true)
		{
			System.out.println("");
			sortAlgTwo(arraytwo);
			amog = checkAlgTwo(arraytwo);
			if(amog == true)
			{
				break;
			}
		}
		System.out.println("");
		System.out.println("Complete!");
		wait(2000);
		for(c = 0; c < arraylengththree; c++)
		{
			String alph = "abcdefghijklmnopqrstuvwxyz";
			int letterpick = rand.nextInt(25)+1;
			arraythree[c] = alph.substring(letterpick,letterpick+1);
			System.out.print(arraythree[c]);
			wait(20);
		}
		for(c = 0; c < arraylengththree; c++)
		{
			String value = alph.substring(c,c+1)
			arraynum[c] =
		}
	}
	public static void sortAlg(int [] array)
	{
		System.out.println("Sorting...");
		int c = 0;
		int stored = 0;
		for(c = 0; c < (array.length-1); c++)
		{
			if(array[c] > array[c+1])
			{
				stored = array[c+1];
				array[c+1] = array[c];
				array[c] = stored;
			}
			stored = 0;
		}
		getAlg(array);
	}
	public static void sortAlgTwo(int [] arraytwo)
	{
		System.out.println("Sorting...");
		int c = 0;
		int stored = 0;
		for(c = 0; c < (arraytwo.length-1); c++)
		{
			if(arraytwo[c] > arraytwo[c+1])
			{
				stored = arraytwo[c+1];
				arraytwo[c+1] = arraytwo[c];
				arraytwo[c] = stored;
			}
			stored = 0;
		}
		getAlgTwo(arraytwo);
	}
	public static boolean checkAlg(int [] array)
	{
		boolean[] boolarr = new boolean[arraylength];
		int c;
		int x = 1;
		for(c = 0; c < (boolarr.length-1); c++)
		{
			boolarr[c] = false;
		}
		for(c = 0; c < (array.length-1); c++)
		{
			if(array[c] < array[c+1])
			{
				boolarr[c] = true;	
			}
			if(array[c] == array[c+1])
			{
				boolarr[c] = true;
			}
			else if(array[c] > array[c+1])
			{
				boolarr[c] = false;
			}
		}
		c = 0;
		for(c = 0; c < (array.length-1); c++)
		{
			if(boolarr[c] != true)
			{
				x = 0;
			}
		}
		if(x == 0 && x != 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean checkAlgTwo(int [] arraytwo)
	{
		boolean[] boolarr = new boolean[arraylengthtwo];
		int c;
		int x = 1;
		for(c = 0; c < (boolarr.length-1); c++)
		{
			boolarr[c] = false;
		}
		for(c = 0; c < (arraytwo.length-1); c++)
		{
			if(arraytwo[c] < arraytwo[c+1])
			{
				boolarr[c] = true;	
			}
			if(arraytwo[c] == arraytwo[c+1])
			{
				boolarr[c] = true;
			}
			else if(arraytwo[c] > arraytwo[c+1])
			{
				boolarr[c] = false;
			}
		}
		c = 0;
		for(c = 0; c < (arraytwo.length-1); c++)
		{
			if(boolarr[c] != true)
			{
				x = 0;
			}
		}
		if(x == 0 && x != 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void getAlg(int [] array)
	{
		Random rand = new Random();
		int c = 0;
		for(c = 0; c < array.length; c++)
		{
			System.out.print(array[c]+" ");
			wait(9);
		}
	}
	public static void getAlgTwo(int [] arraytwo)
	{
		Random rand = new Random();
		int c = 0;
		for(c = 0; c < arraytwo.length; c++)
		{
			System.out.print(arraytwo[c]);
			wait(9);
		}
	}
	public static int getMax(int [] array)
	{	
		Random rand = new Random();
		int c = 0;
		int findmax = 0;
		for(c = 0; c < array.length; c++)
		{
			if(array[c] > findmax)
			{
				findmax = array[c];
			}
		}
		return findmax;
	}
	public static int getMin(int [] array)
	{
		Random rand = new Random();
		int c = 0;
		int findmin = 51;
		for(c = 0; c < array.length; c++)
		{
			if(array[c] < findmin)
			{
				findmin = array[c];
			}
		}
		return findmin;
	}
	public static int getAvg(int [] array)
	{
		Random rand = new Random();
		int c = 0;
		int findavg = 0;
		for(c = 0; c < array.length; c++)
		{
			findavg = findavg+array[c];
		}
		findavg = findavg/array.length;
		return findavg;
	}
	public static void wait(int ms){ 
		try
		{
    		Thread.sleep(ms);
		}
		catch(InterruptedException ex)
		{
    		Thread.currentThread().interrupt();
		}
	}
}