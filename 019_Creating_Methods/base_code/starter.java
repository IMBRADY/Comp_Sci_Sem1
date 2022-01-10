import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toStringCombined(String one,String two){
		System.out.println(one+" "+two);
	}
	public static void toString(String one) {
		System.out.println(one);
	}		
	public static void main(String args[]) {
		// Your code goes below 
		Scanner sc = new Scanner (System.in);
		System.out.println("Write a sentence");
		String one = sc.nextLine();
		System.out.println("Write a sentence");
		String two = sc.nextLine();
		toString(one);
		toStringCombined(one,two);
	}
}
