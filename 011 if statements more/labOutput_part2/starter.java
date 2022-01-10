import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number from 1-5");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Pick another number from 1-5");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Pick one last number from 1-5");
		int num3 = sc.nextInt();
		sc.nextLine();
		if((num3 > num2) && (num3 > num1))
		{
			System.out.println("Your third number was your largest value with a value of "+num3);
		}
		if((num2 > num3) && (num2 > num1))
		{
			System.out.println("Your second number was your largest value with a value of "+num2);
		}
		if((num1 > num3) && (num1 > num2))
		{
			System.out.println("Your first number was your largest value with a value of "+num1);
		}
		if((num3 < num2) && (num3 < num1))
		{
			System.out.println("Your third number was your smallest value with a value of "+num3);
		}
		if((num2 < num3) && (num2 < num1))
		{
			System.out.println("Your second number was your smallest value with a value of "+num2);
		}
		if((num1 < num3) && (num1 < num2))
		{
			System.out.println("Your first number was your smallest value with a value of "+num1);
		}
	}
}
