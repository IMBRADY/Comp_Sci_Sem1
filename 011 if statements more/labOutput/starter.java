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
		if((num1 <= 5) && (num1 >= 1)) {
			System.out.println("Your value for your first number was "+num1+". You have followed my command. Here is a cookie for you");
		}
		if((num1 > 5) || (num1 < 1)) {
			System.out.println("Your value for your first number was "+num1+". You have not followed my command. No cookie for you");
		}
		if((num2 <= 5) && (num2 >= 1)) {
			System.out.println("Your value for your second number was "+num2+". You have followed my command. Here is a cookie for you");
		}
		if((num2 > 5) || (num2 < 1)) {
			System.out.println("Your value for your second number was "+num2+". You have not followed my command. No cookie for you");
		}
	}
}
