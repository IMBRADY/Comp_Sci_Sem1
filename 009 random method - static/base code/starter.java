import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand_num1 = rand.nextInt(10);
		System.out.println(rand_num1);
		int a = 1;
		int rand_num2 = rand.nextInt(100);
		System.out.println(a+rand_num2);
		double b = 2.5;
		double rand_num3 = rand.nextDouble();
		System.out.println(b+rand_num3);
		int c = 14;
		double rand_num4 = rand.nextDouble();
		int rand_num5 = rand.nextInt(575);
		System.out.println(c+rand_num4+rand_num5);
	}
}
