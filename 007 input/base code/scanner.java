import java.util.Scanner;

class scanner {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		System.out.println("What month were you born?");
		String month = sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What day were you born?");
		int day = sc.nextInt();
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double onefifty = sc.nextDouble();
		System.out.println("Hello "+name+", I am scanner. Your age is "+age+", and your birthday is "+month+" "+day+", "+year+". By your input, a buck fifty is "+onefifty+".");
	}
}
