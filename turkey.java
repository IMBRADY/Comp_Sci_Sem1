import java.util.Scanner;
import java.util.Random;

class turkey {
	public static void main(String args[]) {
	int c = 0;
	String[] array = new String[14];
	array[0] = "  \\\\||//  ";
	array[1] = " \\\\|||||// ";
	array[2] = " \\|||~_||/ ";
	array[3] = "\\\\||~_~||//";
	array[4] = "\\\\|~_~_~|//";
	array[5] = "\\\\|_(   )_|//";
	array[6] = "\\||(  .  . )||/";
	array[7] = "\\||(   -)  ||/";
	array[8] = "\\||(   )  ||/";
	array[9] = "\\||( /    ||/";
	array[10] = " \\|     |/";
	array[11] = "   \\|   |/";
	array[12] = "    ||  ||";
	array[13] = "    |__ |__";
		for(c = 0; c < array.length; c++)
		{
		System.out.println(array[c]);
		}
	}
}
