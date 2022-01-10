import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myDog {
	public static void main(String args[]) 
	{
		String breed1;
		String name1;
		int age1;
		String breed2;
		String name2;
		int age2;
		String dogbark;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		minidog doguno = new minidog();
		minidog dogtwo = new minidog();
		System.out.println("Give dog one name");
		name1 = sc.nextLine();
		System.out.println("Give dog one age");
		age1 = sc.nextInt();
		sc.nextLine();
		doguno.setName(name1);
		doguno.setAge(age1);
		System.out.println("Give dog two name");
		name2 = sc.nextLine();
		System.out.println("Give dog two breed");
		breed2 = sc.nextLine();
		dogtwo.setName(name2);
		dogtwo.setBreed(breed2);
		if(doguno.isSleeping())
		{
			System.out.println("Dog one is sleeping");
			dogbark = new String("");
		}
		else
		{
			doguno.bark();
			dogbark = new String("yes");
		}
		if(dogtwo.isSleeping() && dogbark.equals("yes"))
		{
			dogtwo.bark();
		}
		else if(dogbark.equals("yes"))
		{
			dogtwo.bark();
		}
	}
}
