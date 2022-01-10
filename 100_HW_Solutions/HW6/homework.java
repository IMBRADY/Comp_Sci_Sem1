import java.util.Scanner;
import java.util.Random;

class homework {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gimme a numbah");
		int numbah = sc.nextInt();
		int o = 0;
		checkPrime(numbah,o);
	}
	public static void checkPrime(int n, int o)
	{
		int x = n;
		int y = 0;
		int e;
		int b;
		
		while(true)
		{
			if(n%x != 0 && x != n)
			{
				System.out.println("Prime number:"+x);
				o = 1;
				x = e;
				b = e;
			}
		x=x-1;
			if(x == 1)
			{
				break;
			}
		}
		if(o == 1)
		{
			System.out.println(n+" is not prime");
		}
		else
		{
			System.out.println(n+" is prime");
		}
	}
}
