import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Tell me your name?");
	String name = sc.nextLine();
	System.out.println("How many times would you like it to be printed?");
	int times = sc.nextInt();
	sc.nextLine();
	int a = 1;
	while(true)
	{
		System.out.println(name);
		if(a == times)
		{
			break;
		}
		a = a+1;
	}
	}
}
