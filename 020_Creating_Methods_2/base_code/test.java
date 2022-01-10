import java.util.Scanner;
import java.util.Random;

class test {

	public static void main(String args[]) {
		// Your code goes below here
		Random rand1 = new Random();
	Random rand2 = new Random();
	double doublerand = rand1.nextDouble();
	int intrand = rand2.nextInt(43);
	int a = 12;
	double randnum = a+intrand+doublerand;
	System.out.println(randnum);
	}
}
