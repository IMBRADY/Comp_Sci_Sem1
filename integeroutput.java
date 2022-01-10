import java.util.Scanner;
import java.util.Random;

class integeroutput {
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		int numb = sc.nextInt();
		int a = 0;
		while(true){
			System.out.println(numb);
			numb = numb+1;
			a = a+1;
			if(a == 5)
			{
				break;
			}
		}
	}
}
