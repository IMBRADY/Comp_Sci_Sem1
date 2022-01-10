import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int x = a;
		int y = b;
		int times = 1;
		int result;
		while(times < b)
		{
			a = a*x;
			times = times+1;
		}
	return a;
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Gimme a numbah");
	int x = sc.nextInt();
	sc.nextLine();
	System.out.println("Gimme anotha numbah");
	int y = sc.nextInt();
	sc.nextLine();
	int z = pow(x,y);
	System.out.println(z);
	}
}
