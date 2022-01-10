package pkg;
import java.util.Scanner;
import java.util.Random;

public class Cat {
	public String name;
	public String kiten;

	public Cat()
	{
		kiten = new String("Garfield");
	}
	public Cat(String lasama)
	{
		name = lasama;
	}
	public void meow()
	{
		if(name.equals("Garfield"))
		{
			System.out.println("Mowe");
			System.out.println("My nam is "+kiten);
		}
		else if(!(name.equals("Garfield")))
		{
			System.out.println("Mowe");
			System.out.println("My nam is "+name);
		}
	}
}



