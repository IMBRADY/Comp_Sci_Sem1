import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your FAvORITE PHrASE!!!!!");
		String word = sc.nextLine();
		String[] arr = new String[100];
		int[] space = new int[100];
		int i = 0;
		for(int c = 0; c < arr.length; c ++)
		{
			arr[c] = "";
		}
		for(int c = 0; c < word.length(); c++)
		{
			String wor = word.substring(c,c+1);
			if(wor.equals(" "))
			{
				space[i] = c;
				i++;
			}
		}
		for(int c = 0; c < i; c++)
		{
			arr[c] = word.substring(space[c], space[c+1]);
		}
		for(i = 99; i < arr.length; i--)
		{
			System.out.print(arr[i]+" ");
			if(i == 0)
			{
				break;
			}
		}
	}
}
