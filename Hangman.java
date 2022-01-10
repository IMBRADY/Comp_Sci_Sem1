package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has

	//Empty Constructor
	public Hangman()
	{
		guessingWord = generateWord();
		numTries = 5
		public boolean[] arr = new boolean[guessingWord.length];
	}
	//Integer Constructor
	public Hangman(int t)
	{
		guessingWord = guessingWord;
		numTries = t;
	}
	// GIVEN - meaning you can use this, assume it works.
	// @return nothing
	// This method sets your guessingWord to a pre generated lowercase word.
	// This method  is the same as indexOf so no using indexOf.
	public void generateWord(){
		/* implementation not shown */
	}
	/** Returns the index of the FIRST same letter in the guessedWord
	 *  @param letter a letter guessed by the user
	 *  @param start, the starting of index of where in the word to start checking
	 *		Preconditions: Assume letter is one single character and lowercase.
	 *	 			Assume start >= 0
	 *  @return index of first same occurrence of letter, returns -1 if no occurrence found.
	 */
	public int guessCheck(String letter, int start)
	{
		boolean check = true;
		for(int c = 0, c < arr.length; c++)
		{
			arr[c] = false;
		}
		if(start > letter.length)
		{
			start = letter.length;
		}
		for(int start; start < letter.length()-1; start++)
		{
			String a = letter.substring(c,c+1);
			String b = guessingWord.substring(c,c+1);
			if(a.equals(b))
			{
				arr[c] = true;
			}
			else
			{
				arr[c] = false;
			}
		}
		for(int c = 0; c < arr.length; c++)
		{
			if(arr[c] == false)
			{
				check = false;
				return numTries-1;
			}
		}
		if(check == true)
		{
			checkWin(arr[]);
		}
		return -1;
	}
	
	/** Returns true if all booleans in the array are true, false otherwise.
	 *  The purpose of this is to check if all letters have been guessed.
	 *	@param boolean array will have true or false values of guessed letters.
	 *		Precondition: arr.length > 0
	 *  @return true if all values are true, false if one or more are false.
	 */
	public boolean checkWin(boolean [] arr){
		for(int c = 0; c < arr.length; c++)
		{
			if(boolean[c] == false)
			{
				return false;
			}
		}
	}
}


