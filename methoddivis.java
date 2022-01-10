import java.util.Scanner;
class methoddivis {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program
		Scanner sc = new Scanner(System.in);
		System.out.println("Gimme a numbah");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Gimme anotha numba");
		int y = sc.nextInt();
		sc.nextLine();
		divisInt(x,y);
	}
	public static int divisInt(int a, int b)
	{
		int z = a*b;
		System.out.println("your number multiplied together is "+z);
		if((a%3) == 0)
		{
			System.out.println("the multiple of your numbers is divisible by 3");
		}
		else if (!((a%3) == 0))
		{
			System.out.println("the multiple of your numbers if not divisible by 3");
		}
		return z;
	}
}
