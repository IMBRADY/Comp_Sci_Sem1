import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Solve: Find the Math Max of 13-6*11,30%7*(-2)");
		sc.nextDouble();
		int mathoutput1 = (Math.max(13-6*11,30%7*(-2)));
		System.out.println(mathoutput1);
		System.out.println("Solve: Find the Math Sqrt of (3*8+31%7)");
		sc.nextDouble();
		double mathoutput2 = (Math.sqrt(3*8+31%7));
		System.out.println(mathoutput2);
		System.out.println("Solve: Find the Math Pow of (37/3,35%21)");
		sc.nextDouble();
		double mathoutput3 = (Math.pow(37/3,35%21));
		System.out.println(mathoutput3);
		System.out.println("Solve: Find the Math Max of (Math Pow(2,14%3),Math Sqrt(2*6))");
		sc.nextDouble();
		double a = (Math.pow(2,14%3));
		double b = (Math.sqrt(2*6));
		double mathoutput4 = (Math.max(a,b));
		System.out.println(mathoutput4);
		System.out.println("Because of your terrible work, here's another problem. Find the max of x,y when x=2 and y=3");
		sc.nextDouble();
		double x = 2;
		double y = 3;
		double mathx = (Math.max(x,x));
		double mathy = (Math.max(y,y));
		System.out.println("x="+mathx+", y="+mathy);
	}
}
