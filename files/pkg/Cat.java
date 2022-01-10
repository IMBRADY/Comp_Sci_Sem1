package pkg;
import java.util.Scanner;
import java.util.Random;

public class APLine {
	double slope;
	int a;
	int b;
	int c;
	public APLine(int aone, int bone, int cone) {
		a = aone;
		b = bone;
		c = cone;
	}
	public static double getSlope() {
		slope = (-1.0*a)/b;
		return slope;
	}
	public static boolean OnLine(int aone, int bone) {
		boolean check = false;
		int d = aone*a+bone*b+c;
		if(d == 0)
		{
			check = true;
		}
		else if(d != 0)
		{
			check = false;
		}
		return check;
	}
}



