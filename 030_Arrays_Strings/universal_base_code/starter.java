import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x = 0;
		String[] array;
		array = new String[10];
		array[0]="I lov song sing ing!";
		array[1]="eated a bees";
		array[2]="jfafadfadsfeauu32324";
		array[3]="bien shon loge";
		array[4]="起司起司起司起司";
		array[5]="My name is null";
		array[6]=".|.|.|.|.|.|";
		array[7]="oo oo ee ee monkey";
		array[8]="GRYI@QGRAYGKDHADSBVFRGYUHASLG(DUAISJ";
		array[9]="mr pole";
		while(true)
		{
			System.out.println(array[x]);
			if(x == 9)
			{
				break;
			}
			x=x+1;
		}
	}
}
