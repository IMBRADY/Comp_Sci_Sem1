package pkg;
import java.util.Scanner;
import java.util.Random;

public class minidog{
	public String name;
	public int age;
	public String breed;
	Random rand = new Random();
	public minidog()
		{
			name = new String("Clifford");
			age = 3;
			breed = new String("big red dog");
		}
	public minidog(String n)
		{
			name = new String(n);
			age = 1;
			breed = new String("dog dog");
		}
	public minidog(String b, String n)
		{
			name = new String(n);
			age = 1;
			breed = new String(b);
		}
	public minidog(String n, int a)
		{
			name = new String(n);
			age = a;
			breed = new String("dog dog");
		}
	public void setName(String nam)
	{
		name = new String(nam);
	}
	public void setAge(int ag)
	{
		age = ag;
	}
	public void setBreed(String bred)
	{
		breed = new String(bred);
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getBreed()
	{
		return breed;
	}
	public boolean isSleeping()
	{
		int sleep = rand.nextInt(2);
		if(sleep == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void bark()
	{
		System.out.println(name+" barks!");
	}
	
}
